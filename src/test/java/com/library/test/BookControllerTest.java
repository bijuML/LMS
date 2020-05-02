package com.library.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.library.LibraryApp;
import com.library.controller.BookController;
import com.library.entity.Book;
import com.library.repository.BookRepo;
 
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LibraryApp.class)
public class BookControllerTest 
{
    @InjectMocks
    BookController bookController;
     
    @Mock
    BookRepo bookDAO;
     
    @Test
    public void testPersistBook() 
    {
    	Book bookToPersist = createBook();
        Book persistedBook = bookController.persistBook(bookToPersist);
         
        assertThat(persistedBook.getBookISBN()).isEqualTo(bookToPersist.getBookISBN());
    }
     
    private Book createBook() {
    	Book book = new Book();
		book.setBookTitle("TestBook"+getRandomNumberInRange());
		book.setBookISBN("TestISBN"+getRandomNumberInRange());
		book.setBookAuthor("TestAuthor"+getRandomNumberInRange());
		return book;
	}
    
    private static int getRandomNumberInRange() {
    	int min = 0;
    	int max = 1000;
    	Random r = new Random();
    	return r.nextInt((max - min) + 1) + min;
    }

	@Test
    public void testFindAll() 
    {/*
        // given
        Employee employee1 = new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
        Employee employee2 = new Employee(2, "Alex", "Gussin", "example@gmail.com");
        Employees employees = new Employees();
        employees.setEmployeeList(Arrays.asList(employee1, employee2));
 
        when(bookDAO.getAllEmployees()).thenReturn(employees);
 
        // when
        Employees result = BookController.getEmployees();
 
        // then
        assertThat(result.getEmployeeList().size()).isEqualTo(2);
         
        assertThat(result.getEmployeeList().get(0).getFirstName())
                        .isEqualTo(employee1.getFirstName());
         
        assertThat(result.getEmployeeList().get(1).getFirstName())
                        .isEqualTo(employee2.getFirstName());
    */}
    
    
}