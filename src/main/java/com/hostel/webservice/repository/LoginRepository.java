package com.hostel.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hostel.webservice.Model.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
