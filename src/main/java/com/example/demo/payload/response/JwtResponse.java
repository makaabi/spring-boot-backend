package com.example.demo.payload.response;
import java.util.List;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String id;
    private String username;
  
	private List<String> roles;
	private String email;
    private String nom;
    private String prenom;
    private String adresse;
    private String numtel;
    
  



	public JwtResponse(String accessToken, String id, String username, String email, String nom, String prenom,
			String adresse, String numtel, List<String> roles) {
		super();
		this.token = accessToken;
		this.id = id;
		this.username = username;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numtel = numtel;
		this.roles = roles;
	}

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getNom() {
  		return nom;
  	}

  	public void setNom(String nom) {
  		this.nom = nom;
  	}

  	public String getPrenom() {
  		return prenom;
  	}

  	public void setPrenom(String prenom) {
  		this.prenom = prenom;
  	}

  	public String getAdresse() {
  		return adresse;
  	}

  	public void setAdresse(String adresse) {
  		this.adresse = adresse;
  	}



  	public String getNumtel() {
  		return numtel;
  	}

  	public void setNumtel(String numtel) {
  		this.numtel = numtel;
  	}

    public List<String> getRoles() {
        return roles;
    }
}
