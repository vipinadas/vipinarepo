package com.rajan.service;


import java.util.List;

import com.rajan.dao.BookDao;
import com.rajan.dao.BookDaoImpl;
import com.rajan.dto.Book;

public class BookServiceImpl implements BookService{
	BookDao bookDao = new BookDaoImpl();
	@Override
	public void createBookService(Book bookDetails) {
		
		bookDao.createBookDao(bookDetails);
	}

	@Override
	public Book retrieveBookService(int bookId) {
		
		return bookDao.retrieveBookDao(bookId);
	}

	@Override
	public void upDateBookService(Book bookDetails) {
	
		bookDao.upDateBookDao(bookDetails);
	}

	@Override
	public void deleteBookService(int bookId) {
		
		bookDao.deleteBookDao(bookId);
	}

	@Override
	public List<Book> selectBooksByBookNameAndPrice() {
		
		return bookDao.selectBooksByBookNameAndPrice();
	}

}
