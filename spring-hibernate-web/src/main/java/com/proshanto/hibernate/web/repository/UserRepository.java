/**
 * 
 */
package com.proshanto.hibernate.web.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proshanto.hibernate.web.entity.User;

/**
 * @author proshanto
 */
@Repository
public class UserRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserRepository() {
		
	}
	
	public void save(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		System.err.println("session:" + session);
	}
}
