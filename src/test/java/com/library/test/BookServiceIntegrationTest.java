package com.library.test;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.library.entity.Book;
import com.library.entity.Library;
import com.library.repository.BookRepo;
import com.library.repository.LibraryRepo;
import com.library.service.BookServiceImpl;
import com.library.service.IBookService;

@RunWith(SpringRunner.class)
public class BookServiceIntegrationTest {

	@TestConfiguration
	static class BookServiceIntegrationTestContextConfiguration {
		@Bean
		public IBookService bookService() {
			return new BookServiceImpl();
		}
	}

	@Autowired
	private IBookService bookService;

	@MockBean
	private LibraryRepo libRepo;

	@MockBean
	private BookRepo bookRepo;

	@Before
	public void setUp() {
		Book book = createBook();
		Mockito.when(bookRepo.existsById(book.getId())).thenReturn(true);
		Mockito.when(bookRepo.findById(book.getId())).thenReturn(Optional.of(book));
	}

	@Test
	public void whenValidId_thenBookShouldBeFound() {
		Book found = bookService.getBookById(6);
		assertEquals("Success finding book by id", "TestBook", found.getBookTitle());
	}

	private Book createBook() {
		Book newBook = new Book();
		newBook.setBookTitle("TestBook");
		newBook.setBookISBN("TestISBN");
		newBook.setBookAuthor("TestAuthor");
		Library library = new Library();
		library.setId(1);
		newBook.setLibrary(library);
		newBook.setId(6);
		return newBook;
	}
}
