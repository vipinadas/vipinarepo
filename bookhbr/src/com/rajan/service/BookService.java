package com.rajan.service;

import java.util.List;

import com.rajan.dto.Book;

public interface BookService {

		public void createBookService(Book record);
		public Book retrieveBookService(int bookId);
		public void upDateBookService(Book record);
		public void deleteBookService(int bookId);
		public List<Book> selectBooksByBookNameAndPrice();
}
