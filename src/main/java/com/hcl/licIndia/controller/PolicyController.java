package com.hcl.licIndia.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.licIndia.bean.PolicyDetailBean;
import com.hcl.licIndia.bean.UserBean;
import com.hcl.licIndia.model.Policy;
import com.hcl.licIndia.services.PolicyService;

@RestController
@RequestMapping("/insurence")
public class PolicyController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PolicyController.class);
	
	@Autowired
	private PolicyService policyService;

	@GetMapping("/policies")
	public ResponseEntity<List<Policy>> getAllPolicy(){
		LOGGER.error("PloicyController :: getAllPolicy()");
		return new ResponseEntity<>(policyService.getAllPolicy(), HttpStatus.OK);
	}
	
	@GetMapping("/policies/{policyId}")
	public ResponseEntity<PolicyDetailBean> findById(@RequestParam int policyId){
		LOGGER.error("PloicyController :: findById()");
		return new ResponseEntity<>(policyService.findById(policyId), HttpStatus.OK);
	}
	
	@PostMapping("/policies")
	public ResponseEntity<UserBean> buyPolicy(@RequestBody UserBean userBean){
		System.out.println("Userbean "+userBean);
		return new ResponseEntity<>(policyService.buyPolicy(userBean), HttpStatus.CREATED);
	}
}
