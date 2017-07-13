package com.virtualboard.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtualboard.springmvc.dao.Card;
import com.virtualboard.springmvc.dao.CardDao;

@Service
public class CardsService {
	
	@Autowired
	private CardDao cardDao;
	
	public List<Card> getCards(){
		return cardDao.getCards();
	}
}