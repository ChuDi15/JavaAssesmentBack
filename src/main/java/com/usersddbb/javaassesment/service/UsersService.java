package com.usersddbb.javaassesment.service;

import java.util.List;

import com.usersddbb.javaassesment.entity.Users;

public interface UsersService {
	List<Users> findUsers();
	Users addUsers(Users user);
}
