package com.rajan.dto;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "BookTable")
public class Book {
		@Id
		
		  @GenericGenerator(name = "MyBook", strategy = "increment")
		  
		  @GeneratedValue(strategy =GenerationType.AUTO , generator="MyBook" )
		 
		
		private int bookId;
		@Column
		private String bookName;
		@Column
		private String bookAuthor;
		@Column
		private double bookPrice;
		@Column
		private String bookPublisherName;
		@Column
		private Date bookPublishedDate;
		@Column
		private String bookType;
		@Column
		private String bookCountry;
		public Book(int bookId, String bookName, String bookAuthor, double bookPrice, String bookPublisherName,
				Date bookPublishedDate, String bookType, String bookCountry) {
			
			this.bookId = bookId;
			this.bookName = bookName;
			this.bookAuthor = bookAuthor;
			this.bookPrice = bookPrice;
			this.bookPublisherName = bookPublisherName;
			this.bookPublishedDate = bookPublishedDate;
			this.bookType = bookType;
			this.bookCountry = bookCountry;
		}
		
		public Book() {
			super();
		}
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
					+ bookPrice + ", bookPublisherName=" + bookPublisherName + ", bookPublishedDate="
					+ bookPublishedDate + ", bookType=" + bookType + ", bookCountry=" + bookCountry + "]";
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookAuthor() {
			return bookAuthor;
		}
		public void setBookAuthor(String bookAuthor) {
			this.bookAuthor = bookAuthor;
		}
		public double getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(double bookPrice) {
			this.bookPrice = bookPrice;
		}
		public String getBookPublisherName() {
			return bookPublisherName;
		}
		public void setBookPublisherName(String bookPublisherName) {
			this.bookPublisherName = bookPublisherName;
		}
		public Date getBookPublishedDate() {
			return bookPublishedDate;
		}
		public void setBookPublishedDate(Date bookPublishedDate) {
			this.bookPublishedDate = bookPublishedDate;
		}
		public String getBookType() {
			return bookType;
		}
		public void setBookType(String bookType) {
			this.bookType = bookType;
		}
		public String getBookCountry() {
			return bookCountry;
		}
		public void setBookCountry(String bookCountry) {
			this.bookCountry = bookCountry;
		}
		
		
		public Book(String bookName, String bookAuthor, double bookPrice, String bookPublisherName,
				Date bookPublishedDate, String bookType, String bookCountry) {
			this.bookName = bookName;
			this.bookAuthor = bookAuthor;
			this.bookPrice = bookPrice;
			this.bookPublisherName = bookPublisherName;
			this.bookPublishedDate = bookPublishedDate;
			this.bookType = bookType;
			this.bookCountry = bookCountry;
	}

}