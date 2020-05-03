package com.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.entity.Book;
import com.library.entity.Library;
@Service
public interface IBookService {

	public List<Book> getAllBooks();

	public Book getBookById(int id);

	public Book save(Book book);

	public void updateBook(Book book);

	public List<Library> getAllLibs();

	public List<Book> getBooksByLibId(Integer libId);

}
