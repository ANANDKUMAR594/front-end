package com.niit.shoppingcart.DAO.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.model.User;


@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveuser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}
	
	
	

}
