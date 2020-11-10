package com.example.demo.controllers;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }
    @GetMapping("/parent")
	@PreAuthorize("hasRole('PARENT')")
	public String parentAccess() {
		return "Parent Board.";
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