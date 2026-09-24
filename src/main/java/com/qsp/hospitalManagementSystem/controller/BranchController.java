package com.qsp.hospitalManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.hospitalManagementSystem.dto.Branch;
import com.qsp.hospitalManagementSystem.service.BranchService;

@RestController
public class BranchController {

	@Autowired
	BranchService branchService;
	
	@PostMapping("/saveBranch")
	public Branch saveBranch(@RequestBody Branch branch) {
		return branchService.saveBranch(branch);
	}
	
	@GetMapping("/findBranchById")
	public Branch findBranchById(@RequestParam int branchId) {
		return branchService.findBranchById(branchId);
	}
	
	@GetMapping("/findAllBranch")
	public List<Branch> findAllBranch() {
		return branchService.findAllBranch();
	}
	
	@DeleteMapping("/deleteBranch")
	public Branch deleteBranch(int BranchId) {
		return branchService.deleteBranch(BranchId);
	}
	
	@PutMapping("/updateBranch")
	public Branch updateBranch(@RequestParam int oldBranchId,@RequestBody Branch newBranch) {
		return branchService.updateBranch(oldBranchId, newBranch);
	}
}
