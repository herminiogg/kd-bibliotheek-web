package eu.kazernedossin.bibliotheekweb.domain;

public class Book {

    private String id;
    private String title;
    private String author;
    private String ISBN;
    private String bookEditorial;
    private String bookEditorialPlace;
    private String editionDate;
    private String numberOfPages;
    private String language;
    private String keywords;
    private boolean missing;
    private String donatedBy;
    private String lent;
    private String lendingDate;
    private String doubleOrVersion;
    private String info;
    private boolean cdrom;

    public Book() {}

    public Book(String id, String title, String author, String ISBN, String bookEditorial, String bookEditorialPlace, String editionDate, String numberOfPages, String language, String keywords, boolean missing, String donatedBy, String lent, String lendingDate, String doubleOrVersion, String info, boolean cdrom) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.bookEditorial = bookEditorial;
        this.bookEditorialPlace = bookEditorialPlace;
        this.editionDate = editionDate;
        this.numberOfPages = numberOfPages;
        this.language = language;
        this.keywords = keywords;
        this.missing = missing;
        this.donatedBy = donatedBy;
        this.lent = lent;
        this.lendingDate = lendingDate;
        this.doubleOrVersion = doubleOrVersion;
        this.info = info;
        this.cdrom = cdrom;
    }

    public String getId() {
        return id;
    }

    public Book setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getISBN() {
        return ISBN;
    }

    public Book setISBN(String ISBN) {
        this.ISBN = ISBN;
        return this;
    }

    public String getBookEditorial() {
        return bookEditorial;
    }

    public Book setBookEditorial(String bookEditorial) {
        this.bookEditorial = bookEditorial;
        return this;
    }

    public String getBookEditorialPlace() {
        return bookEditorialPlace;
    }

    public Book setBookEditorialPlace(String bookEditorialPlace) {
        this.bookEditorialPlace = bookEditorialPlace;
        return this;
    }

    public String getEditionDate() {
        return editionDate;
    }

    public Book setEditionDate(String editionDate) {
        this.editionDate = editionDate;
        return this;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public Book setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Book setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getKeywords() {
        return keywords;
    }

    public Book setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    public boolean isMissing() {
        return missing;
    }

    public Book setMissing(boolean missing) {
        this.missing = missing;
        return this;
    }

    public String getDonatedBy() {
        return donatedBy;
    }

    public Book setDonatedBy(String donatedBy) {
        this.donatedBy = donatedBy;
        return this;
    }

    public String getLent() {
        return lent;
    }

    public Book setLent(String lent) {
        this.lent = lent;
        return this;
    }

    public String getLendingDate() {
        return lendingDate;
    }

    public Book setLendingDate(String lendingDate) {
        this.lendingDate = lendingDate;
        return this;
    }

    public String getDoubleOrVersion() {
        return doubleOrVersion;
    }

    public Book setDoubleOrVersion(String doubleOrVersion) {
        this.doubleOrVersion = doubleOrVersion;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public Book setInfo(String info) {
        this.info = info;
        return this;
    }

    public boolean isCdrom() {
        return cdrom;
    }

    public Book setCdrom(boolean cdrom) {
        this.cdrom = cdrom;
        return this;
    }
}
