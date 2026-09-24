package com.qsp.hospitalManagementSystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.hospitalManagementSystem.dto.BranchHead;
import com.qsp.hospitalManagementSystem.repo.BranchHeadRepo;

@Repository
public class BranchHeadDao {

	@Autowired
	BranchHeadRepo branchHeadRepo;
	
	public BranchHead saveBranchHead(BranchHead branchHead) {
		return branchHeadRepo.save(branchHead);
	}
}
