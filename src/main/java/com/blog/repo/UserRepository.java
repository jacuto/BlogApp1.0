package com.blog.repo;
import org.springframework.data.repository.CrudRepository;

import com.blog.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);

	User findByActivation(String code);
	
}