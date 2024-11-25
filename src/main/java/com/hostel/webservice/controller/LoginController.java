package com.hostel.webservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hostel.webservice.Model.Login;
import com.hostel.webservice.exception.UserNotFoundException;
import com.hostel.webservice.repository.LoginRepository;


@RestController
public class LoginController {
	
	@Autowired
	private LoginRepository loginRepository;
	
	
	@PostMapping("/login")
	Login newLogin(@RequestBody Login newLogin) {
		return loginRepository.save(newLogin);
	}
	
	
	@PostMapping("/login/validate")
	String validateLogin(@RequestBody Login newLogin) {
		Optional<Login> id1 = loginRepository.findById(newLogin.getId());
		if(id1.isPresent()) {
			Login login = id1.get();
			if(login.getUsername().equals(newLogin.getUsername()) && login.getPassword().equals(newLogin.getPassword())){
				
				return "true";
			}
		}
		return "false";
	}
	
	
	
	@GetMapping("/login/{id}")
	Login getLoginById(@PathVariable Long id) {
		return loginRepository.findById(id)
				.orElseThrow(() ->new UserNotFoundException(id));
	}

}
