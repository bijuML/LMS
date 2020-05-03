package com.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.library.entity.Book;
import com.library.entity.Library;
import com.library.service.IBookService;

@Controller
public class BookController {
	@Autowired
	private IBookService bookService;

	@GetMapping("/getAllLibs")
	@ResponseBody
	public List<Library> getAllLibs() {
		List<Library> listlibs = new ArrayList<Library>();
		listlibs = bookService.getAllLibs();
		return listlibs;
	}

	@GetMapping("/getAllBooks")
	@ResponseBody
	public List<Book> getBooks() {
		List<Book> listBook = new ArrayList<Book>();
		listBook = bookService.getAllBooks();
		return listBook;
	}

	@GetMapping("/book/{bookid}")
	@ResponseBody
	public Book getBookById(@PathVariable("bookid") int bookId) {
		Book book = bookService.getBookById(bookId);
		return book;
	}

	@PostMapping("/book")
	@ResponseBody
	public Book persistBook(@RequestBody Book book) {
		return bookService.save(book);
	}

	@PutMapping("/book")
	@ResponseBody
	public Book updateBook(@RequestBody Book book) {
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
