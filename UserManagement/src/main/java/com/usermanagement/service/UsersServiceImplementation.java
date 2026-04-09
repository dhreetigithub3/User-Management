package com.usermanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.usermanagement.dto.UsersRequestDto;
import com.usermanagement.dto.UsersResponseDto;
import com.usermanagement.entity.Users;
import com.usermanagement.repossitory.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService {
	
	UsersRepository repo;

	public UsersServiceImplementation(UsersRepository repo) {
		super();
		this.repo = repo;
	}
	
	@Override
	public String register(UsersRequestDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersResponseDto searchUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsersResponseDto> viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
