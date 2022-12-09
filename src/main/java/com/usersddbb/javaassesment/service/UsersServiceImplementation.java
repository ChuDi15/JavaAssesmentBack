package com.usersddbb.javaassesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usersddbb.javaassesment.entity.Users;
import com.usersddbb.javaassesment.repository.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService{

	@Autowired
	private UsersRepository uRepository;
	
	@Override
	public List<Users> findUsers() {
		return uRepository.findAll();
		
	}

	@Override
	public Users addUsers(Users user) {
		return uRepository.save(user);
	}

}
