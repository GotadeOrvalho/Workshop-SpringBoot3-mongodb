package com.adrianeferreira.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianeferreira.workshopmongo.domain.User;
import com.adrianeferreira.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findall(){
		return repo.findAll();
	}
}
