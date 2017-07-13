package com.virtualboard.springmvc.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cards")
public class Card {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="columnId")
	private int columnId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	public Card() {

	}
	
	public Card(int id, int columnId, String title, String description) {
		this.id = id;
		this.columnId = columnId;
		this.title = title;
		this.description = description;
	}
	
	public int getColumnId() {
		return columnId;
	}


	public void setColumnId(int columnId) {
		this.columnId = columnId;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
}