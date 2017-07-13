package com.virtualboard.springmvc.dao;

import javax.persistence.*;

import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "boards")
public class Board {
    private int id;
    private String name;
    private List<Column> columns;
    private List<User> users;

    public Board(){

    }

    public Board(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "board", cascade = CascadeType.ALL)
	public List<Column> getColumns() {
    	Collections.sort(columns);
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}
	@ManyToMany(mappedBy = "boards")
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}