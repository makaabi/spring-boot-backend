package com.example.demo.controllers;
import com.example.demo.models.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepository;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
@Autowired
UserRepository userRepository;

	
	
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }
    @GetMapping("/parent")
	@PreAuthorize("hasRole('PARENT')")
    public List<User> getAllUsers(){
		
		List<User> users=new ArrayList<User>();
		userRepository.findAll().
		forEach(users::add);
		return users;
	}

	@GetMapping("/professeur")
	@PreAuthorize("hasRole('PROFESSEUR')")
	public String ProfesseurAccess() {
		return "professeur Board.";
	}
	
	@GetMapping("/serveuillante")
	@PreAuthorize("hasRole('SERVEUILLANTE')")
	public String SERVEUILLANTEAccess() {
		return "serveuillante Board.";
	}

	@GetMapping("/serveuillante_generale")
	@PreAuthorize("hasRole('SERVEUILLANTE_GENERALE')")
	public String SERVEUILLANTE_GENERALEAccess() {
		return "serveuillante_generale Board.";
	}

	@GetMapping("/secretaria")
	@PreAuthorize("hasRole('SECRETARIA')")
	public String SECRETARIAAccess() {
		return "secretaria Board.";
	}
}