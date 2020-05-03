package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Book;
import com.library.entity.Library;
import com.library.exceptionhandler.BookNotFoundException;
import com.library.repository.BookRepo;
import com.library.repository.LibraryRepo;

@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private LibraryRepo libRepo;
	
	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	@Override
	public Book getBookById(int id) {
		if (!bookRepo.existsById(id))
			throw new BookNotFoundException();
		else
			return bookRepo.findById(id).get();
	}
	@Override
	public Book save(Book book) {
		return bookRepo.save(book);
	}
	@Override
	public void updateBook(Book book) {
		bookRepo.save(book);
	}
	@Override
	public List<Library> getAllLibs() {
		return libRepo.findAll();
	}
	@Override
	public List<Book> getBooksByLibId(Integer libId) {
		return bookRepo.findAllByLibraryId(libId);
	}

}
