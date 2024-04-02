package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
class OrderDetailsTest {
	
	@Mock
	IBookService bookService; // creating a proxy
	
	// creating an object of OrderDetails();
	// injects bookService into orderDetails using tester
	@InjectMocks
	OrderDetails orderDetails;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	List<Book> bookList;
	Book book1, book2, book3, book4, book5, book6;
	
	@BeforeEach
	void setUp() throws Exception {
		book1 = new Book("Virat","Sridhar",1900,18);
		book2 = new Book("ABD","Prashanth",1600,17);
		book3 = new Book("KLR","Sridhar",1200,1);
		book4 = new Book("MSD","Adarsh",1500,7);
		book5 = new Book("Maxi","Sridhar",1400,8);
		book6 = new Book("Faf","Prashanth",1200,19);
		bookList = Arrays.asList(book1, book2, book3, book4, book5, book6);
	}

	@AfterEach
	void tearDown() throws Exception {
		orderDetails = null;
	}

	@Test
	void testSetBookService() {
	}

	@Test
	void testShowBooks() {
		String author = "Sridhar";
		List<Book> booksByAuthor = Arrays.asList(book1,book3,book5);
		Mockito.when(bookService.getByAuthor(author)).thenReturn(booksByAuthor);
		List<Book> expected = Arrays.asList(book3,book5,book1);
		// method to be tested
		List<Book> actual= null;
		try {
			actual = orderDetails.showBooks(author);
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		assertEquals(expected, actual);
	}

	@Test
	void testOrderBook() {
		String author ="harsha";
		List<Book> booksByAuthor = Arrays.asList();
		Mockito.when(bookService.getByAuthor(author)).thenReturn(booksByAuthor);
		assertThrows(BookNotFoundException.class, ()->orderDetails.showBooks(author));
		
	}
	
	@Test
	void testExShowBook() {
		String author ="Sridhar";
		Mockito.when(bookService.getByAuthor(author)).thenThrow(BookNotFoundException.class);
		assertThrows(BookNotFoundException.class, ()->orderDetails.showBooks(author));
		
	}


}
