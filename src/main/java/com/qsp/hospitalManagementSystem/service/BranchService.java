package com.qsp.hospitalManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.hospitalManagementSystem.dao.BranchDao;
import com.qsp.hospitalManagementSystem.dto.Branch;

@Service
public class BranchService {

	@Autowired
	BranchDao branchDao;
	
	public Branch saveBranch(Branch branch) {
		return branchDao.saveBranch(branch);
	}
	
	public Branch findBranchById(int branchId) {
		return branchDao.findBranchById(branchId);
	}
	
	public List<Branch> findAllBranch() {
		return branchDao.findAllBranch();
	}
	
	public Branch deleteBranch(int branchId) {
		return branchDao.deleteBranch(branchId);
	}
	
	public Branch updateBranch(int oldBranchId,Branch newBranch) {
		return branchDao.updateBranch(oldBranchId, newBranch);
	}
}
