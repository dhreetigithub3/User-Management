package com.usermanagement.repossitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagement.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	
}
