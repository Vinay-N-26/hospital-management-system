package com.qsp.hospitalManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.hospitalManagementSystem.dto.BranchHead;
import com.qsp.hospitalManagementSystem.service.BranchHeadService;

@RestController
public class BranchHeadController {

	@Autowired
	BranchHeadService branchHeadService;
	
	@PostMapping("/saveBranchHead")
	public BranchHead saveBranchHead(@RequestBody BranchHead branchHead) {
		return branchHeadService.saveBranchHead(branchHead);
		
	}
}
