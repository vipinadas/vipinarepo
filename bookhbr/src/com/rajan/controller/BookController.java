package com.rajan.controller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import com.rajan.dto.Book;
import com.rajan.service.BookService;
import com.rajan.service.BookServiceImpl;
import com.rajan.sessionutil.SessionUtil;

public class BookController {
	BookService service = new BookServiceImpl();

	public static void main(String[] args) {
		BookController obj = new BookController();
		// obj.insertBookDetails();
		// obj.selectBookDetails();
		// obj.updateBookDetails();
		// obj.deleteBookDetails();
		//obj.selectBooksByBookNameAndPrice();
   String hqlQuery = "Update Book a set Book.bookName ='new_Ramayana' Where Book.bookPrice=251";
   Query query = SessionUtil.getSession().createNamedQuery(hqlQuery);
   SessionUtil.getSession().saveOrUpdate(query);
 int rowsUpdated=  query.executeUpdate();
 System.out.println("No Of Rows Updated :"+rowsUpdated);
	}

	public void updateBookDetails() {
		Book book = new Book(301, "Swami and Friends", "R.K Narayan", 500, "new Delhi Press", new Date(2011 - 07 - 30),
				"Novel", "India");
		service.upDateBookService(book);
	}

	public void deleteBookDetails() {
		System.out.println("enter the Book Id to delete");
		Scanner sc = new Scanner(System.in);
		int pId = sc.nextInt();
		 sc.close();
		service.deleteBookService(pId);
       
	}

	public void selectBookDetails() {
		System.out.println("enter the Book Id");
		Scanner sc = new Scanner(System.in);
		int bookId = sc.nextInt();
		System.out.println(service.retrieveBookService(bookId));

	}

	public void insertBookDetails() {
		Book book1 = new Book("Ramayana", "Valmiki", 251, "Geeta Press Gorakhpur", new Date(2022 - 05 - 31),
				"Religious", "India");
		Book book2 = new Book("Mahabharat", "VedVyas", 500, "Geeta Press Gorakhpur", new Date(2018 - 05 - 31),
				"Religious", "India");
		Book book3 = new Book("Wings Of Fire", "A.P.J Abdul Kalam", 400, "Delhi press", new Date(2005 - 07 - 31),
				"Inspirational", "India");
		service.createBookService(book1);
		service.createBookService(book2);
		service.createBookService(book3);
	}

	public List<Book> selectBooksByBookNameAndPrice() {
		return service.selectBooksByBookNameAndPrice();
	}
}