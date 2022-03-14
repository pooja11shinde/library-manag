package com.edu.LibrarySystem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Book_tbl")
public class Book {
	@Id
	@Column
	private int bookId;
	@Column
	private String bookName;
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
		// TODO Auto-generated method stub
		
	}
	


