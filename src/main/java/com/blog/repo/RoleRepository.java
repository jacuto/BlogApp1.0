package com.blog.repo;
import org.springframework.data.repository.CrudRepository;

import com.blog.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

	Role findByRole(String role);
	
}