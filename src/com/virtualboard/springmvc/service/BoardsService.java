package com.virtualboard.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtualboard.springmvc.dao.Board;
import com.virtualboard.springmvc.dao.BoardDao;


@Service
public class BoardsService {

	@Autowired
	private BoardDao boardDao;
	
	public Board getBoard(int id){	
		return boardDao.getBoard(id);
	}
}