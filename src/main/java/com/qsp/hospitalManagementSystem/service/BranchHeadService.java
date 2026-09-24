package com.qsp.hospitalManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.hospitalManagementSystem.dao.BranchHeadDao;
import com.qsp.hospitalManagementSystem.dto.BranchHead;

@Service
public class BranchHeadService {

	@Autowired
	BranchHeadDao branchHeadDao;
	
	public BranchHead saveBranchHead(BranchHead branchHead) {
		return branchHeadDao.saveBranchHead(branchHead);
	}
}
