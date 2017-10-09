/**
 * 
 */
package com.proshanto.hibernate.web.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proshanto.hibernate.web.entity.User;
import com.proshanto.hibernate.web.repository.UserRepository;

/**
 * @author proshanto
 */
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserService() {
		
	}
	
	@Transactional
	public void save(User user) {
		userRepository.save(user);
	}
}
