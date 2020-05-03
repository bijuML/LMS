package com.library.test;

import com.library.entity.Book;
import com.library.entity.Library;

public class SpringTestUtils {
	public Book createBook() {
		Book newBook = new Book();
		newBook.setBookTitle("TestBook");
		newBook.setBookISBN("TestISBN");
		newBook.setBookAuthor("TestAuthor");
		Library library = new Library();
		library.setId(1);
		newBook.setLibrary(library);
		return newBook;
	}
}
