package eu.kazernedossin.bibliotheekweb;

import eu.kazernedossin.bibliotheekweb.dao.BooksDAO;
import eu.kazernedossin.bibliotheekweb.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BiblioteekWebApplication {

	@Autowired
	private BooksDAO booksDAO;

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String books(Model model) {
		List<Book> books = booksDAO.getAllBooks();
		model.addAttribute("books", books);
		return "books";
	}

	@GetMapping(value = "/books/{id}")
	public String book(@PathVariable String id, Model model) {
		Book book = booksDAO.getBookById(id);
		model.addAttribute("book", book);
		return "book";
	}

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}

}
