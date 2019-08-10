package com.hcl.licIndia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.licIndia.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {

	List<Policy> findByPolicyId(int policyId);

	
}
