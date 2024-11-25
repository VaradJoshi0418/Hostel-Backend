package com.hostel.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hostel.webservice.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
