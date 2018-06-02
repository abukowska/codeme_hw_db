package com.codeme.dbhomework.jpamodel;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "books")
public class Book {
	
	@Id // identyfikator rekordu
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ustalenie generowania identyfikatora
	private Integer id;
	private String title;
	private String author;
	private Date publishYear;
	private Integer amount;
	
	public Book() {
	}
	
	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Date getPublishYear() {
		return publishYear;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublishYear(Date publishYear) {
		this.publishYear = publishYear;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return String.format("%d) %s by %s", id, title, author);
		
	}
}