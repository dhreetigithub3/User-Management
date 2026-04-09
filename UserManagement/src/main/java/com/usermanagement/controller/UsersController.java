package com.usermanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagement.dto.UsersRequestDto;
import com.usermanagement.dto.UsersResponseDto;
import com.usermanagement.entity.Users;
import com.usermanagement.service.UsersService;

@RestController
public class UsersController {
	
	UsersService service;

	public UsersController(UsersService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/register")
	public String register(@RequestBody UsersRequestDto user) {
		return service.register(user);
	}
	
	@GetMapping("/searchUser/{id}")
	public UsersResponseDto searchUser(@PathVariable Long id) {
		return service.searchUser(id);
	}
	
	@GetMapping("/viewAllUsers")
	public List<UsersResponseDto> viewAllUsers(){
		return service.viewAllUsers();
	}
	
	@PutMapping("/updateUser")
	public String updateUser(@RequestBody Users user) {
		return service.updateUser(user);
	}
	
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable Long id) {
		return service.deleteUser(id);
	}

}
