package com.usersddbb.javaassesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usersddbb.javaassesment.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
