package com.usermanagement.service;

import java.util.List;

import com.usermanagement.dto.UsersRequestDto;
import com.usermanagement.dto.UsersResponseDto;
import com.usermanagement.dto.UsersUpdateRequestDto;

public interface UsersService {
	
	String register(UsersRequestDto userDto);
	
	UsersResponseDto searchUser(Long id);
	
	List<UsersResponseDto> viewAllUsers();
	
	UsersResponseDto updateUser(UsersUpdateRequestDto userDto);
	
	String deleteUser(Long id);
}
