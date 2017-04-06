package com.niit.shoppingcart.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.model.User;
import com.niit.shoppingcart.service.UserService;



@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;
	
	
	public void saveuser(User user) {
			this.dao.saveuser(user);
	}

}
