package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.library.entity.Book;
import com.library.entity.Library;
import com.library.repository.BookRepo;
import com.library.repository.LibraryRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private LibraryRepo libRepo;

	public List<Book> getAllBooks() throws DataAccessException, JsonProcessingException {
		return bookRepo.findAll();
	}

	public Book getBooksById(int id) {
		return bookRepo.findById(id).get();
	}

	public void saveOrUpdate(Book books) {
		bookRepo.save(books);
	}

	public void updateBook(Book book) {
		bookRepo.save(book);
	}

	public List<Library> getAllLibs() throws DataAccessException, JsonProcessingException {
		return libRepo.findAll();
	}

	public List<Book> getBooksByLibId(Integer libId) {
		return bookRepo.findAllByLibraryId(libId);
	}

}
