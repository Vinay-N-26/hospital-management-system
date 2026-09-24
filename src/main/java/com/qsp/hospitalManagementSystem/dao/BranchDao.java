package com.qsp.hospitalManagementSystem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.hospitalManagementSystem.dto.Branch;
import com.qsp.hospitalManagementSystem.exception.DoesNotExistException;
import com.qsp.hospitalManagementSystem.repo.BranchRepo;

@Repository
public class BranchDao {

	@Autowired
	BranchRepo branchRepo;
	
	public Branch saveBranch(Branch branch) {
		return branchRepo.save(branch);
	}
	
	public Branch findBranchById(int branchId) {
		Optional<Branch> optional= branchRepo.findById(branchId);
		if(optional.isPresent()) {
			return optional.get();
		}
		else
		{
			throw new DoesNotExistException("There is no Branch present in ID : "+branchId);
		}
	}
	
	public List<Branch> findAllBranch() {
		return branchRepo.findAll();
	}
	
	public Branch deleteBranch(int branchId) {
		Branch branch=findBranchById(branchId);
		branchRepo.delete(branch);
		return branch;
	}
	
	public Branch updateBranch(int oldBranchId,Branch newBranch) {
		newBranch.setBranchId(oldBranchId);
		return branchRepo.save(newBranch);
	}
}
