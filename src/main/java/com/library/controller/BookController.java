package com.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.library.entity.Book;
import com.library.entity.Library;
import com.library.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	@GetMapping("/getAllLibs")
	@ResponseBody
	public List<Library> getAllLibs() {
		List<Library> listlibs = new ArrayList<Library>();
		try {
			listlibs = bookService.getAllLibs();
		} catch (DataAccessException | JsonProcessingException e) {
			e.printStackTrace();
		}
		return listlibs;
	}

	@GetMapping("/getAllBooks")
	@ResponseBody
	public List<Book> getBooks() {
		List<Book> listBook = new ArrayList<Book>();
		try {
			listBook = bookService.getAllBooks();
		} catch (DataAccessException | JsonProcessingException e) {
			e.printStackTrace();
		}
		return listBook;
	}

	@GetMapping("/book/{bookid}")
	@ResponseBody
	private Book getBooks(@PathVariable("bookid") int bookId) {
		Book book = bookService.getBooksById(bookId);
		System.out.println("Book Title is-->" + book.getBookTitle());
		return book;
	}

	@PostMapping("/book")
	@ResponseBody
	private Book persistBook(@RequestBody Book book) {
		bookService.saveOrUpdate(book);
		return book;
	}

	@PutMapping("/book")
	@ResponseBody
	private Book updateBook(@RequestBody Book book) {
		bookService.updateBook(book);
		return book;
	}

	@GetMapping("/getBooksByLibId/{lib_id}")
	@ResponseBody
	@JsonIgnore
	public List<Book> getBooksByLibId(@PathVariable("lib_id") Integer libId) {
		List<Book> listBook = new ArrayList<Book>();
		listBook = bookService.getBooksByLibId(libId);
		return listBook;
	}
}
