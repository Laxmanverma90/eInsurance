package com.hcl.licIndia.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.licIndia.bean.PolicyDetailBean;
import com.hcl.licIndia.bean.UserBean;
import com.hcl.licIndia.controller.PolicyController;
import com.hcl.licIndia.model.Policy;
import com.hcl.licIndia.model.User;
import com.hcl.licIndia.repository.PolicyRepository;
import com.hcl.licIndia.repository.UserRepository;
import com.hcl.licIndia.services.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PolicyController.class);
	
	@Autowired
	private PolicyRepository policyRepo;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Policy> getAllPolicy() {
		LOGGER.error("PolicyServiceImpl :: getAllPolicy()");
		List<Policy> list =  policyRepo.findAll();
		System.out.println(list);
		LOGGER.error("PolicyServiceImpl :: getAllPolicy() : "+list);
		return list;
	}
	@Override
	public PolicyDetailBean findById(int policyId) {
		
		LOGGER.error("PolicyServiceImpl :: findById() : "+policyId);
		
		Policy policy = policyRepo.getOne(policyId);
		PolicyDetailBean policyDetailBean = new PolicyDetailBean();
		BeanUtils.copyProperties(policy, policyDetailBean);
		
		LOGGER.error("PolicyServiceImpl :: findById() : "+policyDetailBean);
		
		return policyDetailBean;
	}
	
	/*@Override
	public UserBean buyPolicy(UserBean userBean) {
		User user = new User();
		System.out.println("userBean :: "+userBean);
		List<Policy> policy = policyRepo.findByPolicyId(userBean.getPolicyId());
		System.out.println("policy :: "+policy);
//		policy.setPolicyId(userBean.getPolicyId());
		BeanUtils.copyProperties(userBean, user);
//		List<Policy> policies = new ArrayList<>();sz
//		policies.add(policy);
//		user.setPolicies(policies);
		System.out.println("users :: "+user);
//		policy.get(0).getUsers().add(user);
		user.setPolicies(policy);
		System.out.println("users :: "+user);
		user = userRepository.save(user);
		BeanUtils.copyProperties(user, userBean);
		return userBean;
	}*/
	
	@Override
	public UserBean buyPolicy(UserBean userBean) {
		User user = new User();
		System.out.println("userBean :: "+userBean);
		List<Policy> policy = policyRepo.findByPolicyId(userBean.getPolicyId());
		System.out.println("policy :: "+policy);
		BeanUtils.copyProperties(userBean, user);
		System.out.println("users :: "+user);
		user.setPolicies(policy);
		System.out.println("users :: "+user);
		userRepository.save(user);
		return null;
	}

}
