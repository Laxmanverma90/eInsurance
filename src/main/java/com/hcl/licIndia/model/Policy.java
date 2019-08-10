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
@Table(name = "lic_policy")
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policyId;

	@Size(min = 10, max = 30)
	private String planName;

	@Size(min = 10, max = 30)
	private String planType;

	@Size(min = 10, max = 30)
	private String bankName;

	@Size(min = 8, max = 15)
	private String entryAge;

	@Size(min = 1, max = 2)
	private int maxMaturityAge;

	@Size(min = 8, max = 15)
	private double minSunAssured;

	@Size(min = 6, max = 10)
	private String status;

	@Size(min = 30, max = 500)
	private String description;

	@ManyToMany(mappedBy = "policies")
	private List<User> users;
	
	/*@ManyToMany
	@JoinTable(name = "licPolicyUser", joinColumns = @JoinColumn(name = "userId"), inverseJoinColumns = @JoinColumn(name = "policyId"))
	private List<User> users;*/
}