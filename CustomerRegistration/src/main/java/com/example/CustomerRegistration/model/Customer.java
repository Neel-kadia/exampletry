package com.example.CustomerRegistration.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "dateofbirth")
	private Date dateOfBirth;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "address1")
	private String address1;
	@Column(name = "address2")
	private String address2;
	@Column(name = "age")
	private String age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "email")
	private String email;

}