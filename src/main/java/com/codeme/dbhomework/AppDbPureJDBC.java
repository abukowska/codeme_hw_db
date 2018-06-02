package com.codeme.dbhomework;

import java.sql.SQLException;
import java.util.List;

import com.codeme.dbhomework.jdbcmodel.*;

public class AppDbPureJDBC {

	
	public static void main (String[] args ) {

		Books books = new Books();
		List<Book> bookList = null;
		
		try {
			bookList = books.loadBooksFromDb();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(Book book : bookList) {
			System.out.println(book.toString());
		}
		
	}
	
}
