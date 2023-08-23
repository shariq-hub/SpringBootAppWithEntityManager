package com.databaseEntityManager.entityManager.repo;

import com.databaseEntityManager.entityManager.entity.Users;

public interface UsersRepo{
	
	Users findById(long id);
	
	void save(Users users);
}
