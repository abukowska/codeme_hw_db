package com.codeme.dbhomework.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.codeme.dbhomework.jpa.model.Book;

public class AppDBHibernate {

	public static void main(String[] args) {

		List<Book> bookList;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Books");
		EntityManager em = emf.createEntityManager();

		bookList = em.createQuery("FROM Book", Book.class).getResultList();

		for (Book book : bookList) {
			System.out.println(book);
		}

		em.close();
		emf.close();

	}

}
