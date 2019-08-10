package com.hcl.licIndia.services;

import java.util.List;

import com.hcl.licIndia.bean.PolicyDetailBean;
import com.hcl.licIndia.bean.UserBean;
import com.hcl.licIndia.model.Policy;

public interface PolicyService {

	List<Policy> getAllPolicy();

	PolicyDetailBean findById(int policyId);

	UserBean buyPolicy(UserBean userBean);

}
