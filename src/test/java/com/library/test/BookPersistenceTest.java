package com.library.test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.library.entity.Book;
import com.library.entity.Library;
import com.library.repository.BookRepo;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookPersistenceTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	BookRepo bookRepo;

	@Test
	public void testPersistBook() {
		Book bookToPersist = createBook();
		Book persistedBook = entityManager.persist(bookToPersist);
		assertEquals("Found the newly persisted book successfully", bookToPersist.getBookISBN(),
				persistedBook.getBookISBN());
		entityManager.flush();

		bookRepo.findAllByLibraryId(1).forEach(book -> {
			if (book.getBookISBN().equalsIgnoreCase(bookToPersist.getBookISBN())) {
				assertEquals("Found the newly persisted book using findAllByLibraryId successfully",
						bookToPersist.getBookISBN(), book.getBookISBN());
			}
		});
	}

	private Book createBook() {
		Book newBook = new Book();
		newBook.setBookTitle("TestBook" + getRandomNumberInRange());
		newBook.setBookISBN("TestISBN" + getRandomNumberInRange());
		newBook.setBookAuthor("TestAuthor" + getRandomNumberInRange());
		Library library = new Library();
		library.setId(1);
		newBook.setLibrary(library);
		return newBook;
	}

	private static int getRandomNumberInRange() {
		int min = 0;
		int max = 1000;
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}