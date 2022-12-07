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


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	@Column(name = "first_name")
	public String firstName;
	@Column(name = "last_name")
	public String lastName;
	@Column(name = "date_of_birth")
	public Date dateOfBirth;
	@Column(name = "mobile", unique = true)
	public String mobile;
	@Column(name = "address1")
	public String address1;
	@Column(name = "address2")
	public String address2;
	@Column(name = "age")
	public String age;
	@Column(name = "gender")
	public String gender;
	@Column(name = "email", unique = true)
	public String email;

}