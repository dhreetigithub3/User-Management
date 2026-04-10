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
	public String register(UsersRequestDto userDto) {
		Users user = new Users();
		user.setUsername(userDto.getUsername());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setMobile(userDto.getMobile());
		user.setDob(userDto.getDob());
		user.setGender(userDto.getGender());
		user.setAddress(userDto.getAddress());
		user.setDpUrl(userDto.getDpUrl());
		
		repo.save(user);
		
		return "User registered successfully!";
	}

	@Override
	public UsersResponseDto searchUser(Long id) {
		Users user = repo.findById(id).get();
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
