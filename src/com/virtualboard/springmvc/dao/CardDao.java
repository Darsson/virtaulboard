package com.virtualboard.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Component("cardDao")
public class CardDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session session() {
		return sessionFactory.getCurrentSession();
	}
	
	public Card getCard(int id){
		return new Card(id, 0,"Do somthing", "Its important");
	}
	
	@SuppressWarnings("unchecked")
	public List<Card> getCards(){
//		List<Card> cards = new ArrayList<Card>();
//		
//		cards.add(new Card(0, 0,"Do somthing", "Its important"));
//		cards.add(new Card(1, 0,"Helloo", "Darson"));
//		cards.add(new Card(2, 0, "Praca, Praca, Praca", "Nie spimy, zwiedzamy"));
//		cards.add(new Card(2, 0, "Praca, Praca, Praca", "Nie spimy, zwiedzamy"));
//		cards.add(new Card(2, 0, "Praca, Praca, Praca", "Nie spimy, zwiedzamy"));
//		cards.add(new Card(2, 0, "Praca, Praca, Praca", "Nie spimy, zwiedzamy"));
//		cards.add(new Card(2, 0, "Praca, Praca, Praca", "Nie spimy, zwiedzamy"));
//		cards.add(new Card(2, 0, "Praca, Praca, Praca", "Nie spimy, zwiedzamy"));
//		cards.add(new Card(2, 0, "Praca, Praca, Praca", "Nie spimy, zwiedzamy"));
//		cards.add(new Card(3, 1, "Kto mam wybierac miedzy zlem a zalem", "To wole nie wybierac w cale"));
//		cards.add(new Card(3, 1, "Kto mam wybierac miedzy zlem a zalem", "To wole nie wybierac w cale"));
//		cards.add(new Card(3, 1, "Kto mam wybierac miedzy zlem a zalem", "To wole nie wybierac w cale"));
//		cards.add(new Card(3, 1, "Kto mam wybierac miedzy zlem a zalem", "To wole nie wybierac w cale"));
//		cards.add(new Card(4, 2, "Do somthing more", "Its more important"));
		
		return session().createCriteria(Card.class).list();
	}
	
}
