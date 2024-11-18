package com.example.signupapp.repository;

import com.example.signupapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository {

	void save(User user);}
