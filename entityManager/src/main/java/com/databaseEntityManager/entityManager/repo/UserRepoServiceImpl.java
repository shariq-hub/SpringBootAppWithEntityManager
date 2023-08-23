package com.databaseEntityManager.entityManager.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.databaseEntityManager.entityManager.entity.Users;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class UserRepoServiceImpl implements UsersRepo{

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public Users findById(long id) {
		return entityManager.find(Users.class, id);
	}


	@Override
	@Transactional
	public void save(Users users) {
		entityManager.persist(users);
		
		
	}
	
	

}
