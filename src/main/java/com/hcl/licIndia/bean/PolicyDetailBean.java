package com.hcl.licIndia.bean;

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
public class PolicyDetailBean {
	
	private int policyId;
	private String planName;
	private String planType;
	private String bankName;
	private String entryAge;
	private int maxMaturityAge;
	private double minSunAssured;
	private String status;
	private String description;
}