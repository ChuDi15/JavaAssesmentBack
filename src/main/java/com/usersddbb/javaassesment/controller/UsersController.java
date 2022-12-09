package com.usersddbb.javaassesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usersddbb.javaassesment.entity.Users;
import com.usersddbb.javaassesment.service.UsersService;

@CrossOrigin (origins = "*")
@RestController
@RequestMapping("/users")
public class UsersController {
	
@Autowired
private UsersService uService;
	
	@GetMapping("/all")
	public List<Users> getAllUsers(){
		return uService.findUsers();
		
	}
	
	@PostMapping("/create")
	public Users createUsers(@RequestBody Users user){
	 return uService.addUsers(user);
		
	}
}
