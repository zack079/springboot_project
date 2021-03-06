package com.myProject.projectManagementSystem.models;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 4, message = "le nom d'utilisateur doit contenir au moins 4 caractères!")
    @Column(unique = true)
    private String username;
    @Size(min = 3, message = "le prénom doit contenir au moins 3 caractères!")
    private String firstname;
    @Size(min = 3, message = "le nom d'utilisateur doit contenir au moins 3 caractères!")
    private String lastname;
    //@Column(unique = true)
    private String email;
    private String password;
    private Date dateOfBirth;
    @Size(min = 1, message = "l'adresse ne doit pas être vide!")
    private String address;
    @Size(min = 1, message = "la ville ne doit pas être vide!")
    private String city;
    public User(){

    }
    public User(String firstname, String lastname, Date dateOfBirth, String address,String city,String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.city=city;
        this.email=email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "username" + username +" id = "+ id +
                ", firstname=" + firstname +
                        ", lastname=" + lastname  +
                        ", date of birth=" + dateOfBirth +
                        ", address=" + address  +
                        ", city=" + city
                ;
    }
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
