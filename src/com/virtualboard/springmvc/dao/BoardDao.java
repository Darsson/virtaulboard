package com.virtualboard.springmvc.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
@Component("boardDao")
public class BoardDao{
		
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session session() {
		return sessionFactory.getCurrentSession();
	}
	
	public Board getBoard(int id){
		
		Criteria crit = session().createCriteria(Board.class);
		crit.add(Restrictions.idEq(id));
		return (Board)crit.uniqueResult();
//		return new Board(id, "Myboard");
	}	
}
