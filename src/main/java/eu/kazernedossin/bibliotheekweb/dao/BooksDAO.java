package eu.kazernedossin.bibliotheekweb.dao;

import eu.kazernedossin.bibliotheekweb.domain.Book;
import org.springframework.beans.factory.annotation.Value;
import javax.annotation.ManagedBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class BooksDAO {

    @Value("${bibliotheek.databaseLocation}")
    private String database;
    @Value("${bibliotheek.username}")
    private String username;
    @Value("${bibliotheek.password}")
    private String password;

    public BooksDAO() {}

    public List<Book> getAllBooks() {
        Connection c = null;
        List<Book> books = new ArrayList<>();
        try {
            c = doConnection();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Boeken;");
            while(rs.next()) {
                books.add(getBookFromResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } return books;
    }

    public Book getBookById(String id) {
        Connection c = null;
        Book book = null;
        try {
            c = doConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM Boeken where id = ?;");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            book = getBookFromResultSet(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } return book;
    }

    private Book getBookFromResultSet(ResultSet rs) throws SQLException {
        return new Book()
                .setId(rs.getString("ID"))
                .setTitle(rs.getString("Functie"))
                .setAuthor(rs.getString("auteur"))
                .setISBN(rs.getString("ISBN"))
                .setBookEditorial(rs.getString("ed"))
                .setBookEditorialPlace(rs.getString("ed pl"))
                .setEditionDate(rs.getString("ed dat"))
                .setInfo(rs.getString("info"))
                .setMissing(rs.getBoolean("Missing"))
                .setNumberOfPages(rs.getString("pag"))
                .setLanguage(rs.getString("Taal"))
                .setKeywords(rs.getString("Onderwerp"))
                .setDonatedBy(rs.getString("Geschonken door"))
                .setLent(rs.getString("Uitgeleend door"))
                .setLendingDate(rs.getString("Op"))
                .setDoubleOrVersion(rs.getString("Dubbel/Versie"))
                .setCdrom(rs.getBoolean("cd-rom"));
    }

    public Connection doConnection() throws SQLException {
        String url="jdbc:ucanaccess://" + database + ";memory=false";
        return DriverManager.getConnection(url, "", "ilse");
    }

}
