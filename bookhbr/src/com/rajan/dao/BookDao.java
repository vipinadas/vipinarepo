package com.rajan.dao;

import java.util.List;

import com.rajan.dto.Book;

public interface BookDao {
	public void createBookDao(Book record);
	public Book retrieveBookDao(int bookId);
	public void upDateBookDao(Book record);
	public void deleteBookDao(int bookId);
   public List<Book> selectBooksByBookNameAndPrice();
}
