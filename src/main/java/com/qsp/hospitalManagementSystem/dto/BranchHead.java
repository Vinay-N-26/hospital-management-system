package com.qsp.hospitalManagementSystem.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BranchHead {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchHeadId;
	private String branchHeadName;
	private long branchHeadNumber;
	private String branchHeadAddress;
	public int getBranchHeadId() {
		return branchHeadId;
	}
	public void setBranchHeadId(int branchHeadId) {
		this.branchHeadId = branchHeadId;
	}
	public String getBranchHeadName() {
		return branchHeadName;
	}
	public void setBranchHeadName(String branchHeadName) {
		this.branchHeadName = branchHeadName;
	}
	public long getBranchHeadNumber() {
		return branchHeadNumber;
	}
	public void setBranchHeadNumber(long branchHeadNumber) {
		this.branchHeadNumber = branchHeadNumber;
	}
	public String getBranchHeadAddress() {
		return branchHeadAddress;
	}
	public void setBranchHeadAddress(String branchHeadAddress) {
		this.branchHeadAddress = branchHeadAddress;
	}
	
}
