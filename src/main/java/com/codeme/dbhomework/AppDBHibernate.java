package com.codeme.dbhomework;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppDBHibernate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BOOKS");
        EntityManager em = emf.createEntityManager();
	}

}
