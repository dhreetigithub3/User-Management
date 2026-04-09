package com.usermanagement.service;

import java.util.List;

import com.usermanagement.dto.UsersRequestDto;
import com.usermanagement.dto.UsersResponseDto;
import com.usermanagement.entity.Users;

public interface UsersService {
	
	String register(UsersRequestDto user);
	UsersResponseDto searchUser(Long id);
	List<UsersResponseDto> viewAllUsers();
	String updateUser(Users user);
	String deleteUser(Long id);
}
