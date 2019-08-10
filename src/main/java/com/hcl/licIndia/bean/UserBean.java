package com.hcl.licIndia.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserBean {
	
	private int userId;

	/*@NotNull
	@NotBlank
	@Pattern(regexp="^[A-Za-z0-9]*$")
	@Size(min = 10, max = 30, message="Name should be between 10-30 char.")*/
	private String name;

/*	@Pattern(regexp="^[1-9]*$")
	@Size(min = 1, max = 2, message = "Age should be between 1-99 years.")*/
	private int age;

	/*@Pattern(regexp="^[1-9]*$")
	@Size(min = 10, max = 10, message="Phone number should be 10-digit.")*/
	private String phone;
	
	private int policyId;
}