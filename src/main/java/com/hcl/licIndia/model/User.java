package com.hcl.licIndia.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lic_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Size(min = 10, max = 30, message = "Name should be between 10-30 char.")
	private String name;

//	@Size(min = 1, max = 2, message = "Age should be between 1-99 years.")
	private int age;

	@Size(min = 10, max = 10, message = "Phone number should be 10-digit.")
	private String phone;

	@ManyToMany
	@JoinTable(name = "licPolicyUser", joinColumns = @JoinColumn(name = "userId"), inverseJoinColumns = @JoinColumn(name = "policyId"))
	private List<Policy> policies;
	
	/*@ManyToMany(mappedBy="users")
	private Set<Policy> policies;*/
}