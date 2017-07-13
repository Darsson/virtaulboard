package com.virtualboard.springmvc.dao;

import javax.persistence.*;

@Entity
@Table(name = "columns")
public class Column implements Comparable<Column>{
    private int id;
    private String name;
    private int position;
    private Board board;

    public Column() {

    }

    public Column(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Column(String name, int position, Board board) {
        this.name = name;
        this.position = position;
        this.board = board;
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

    public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@ManyToOne
    @JoinColumn(name = "boardId")
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
    
	@Override
	public int compareTo(Column column) {
		int comparePosition = column.getPosition();

		return this.position - comparePosition;
	}  
}
