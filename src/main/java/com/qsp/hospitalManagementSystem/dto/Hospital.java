package com.qsp.hospitalManagementSystem.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hospitalId;
	private String hospitaalName;
	private String hospitalGst;
	private String hospitalGmail;
	
	@OneToMany
	private List<Branch> branch;
	
	public List<Branch> getBranch() {
		return branch;
	}
	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitaalName() {
		return hospitaalName;
	}
	public void setHospitaalName(String hospitaalName) {
		this.hospitaalName = hospitaalName;
	}
	public String getHospitalGst() {
		return hospitalGst;
	}
	public void setHospitalGst(String hospitalGst) {
		this.hospitalGst = hospitalGst;
	}
	public String getHospitalGmail() {
		return hospitalGmail;
	}
	public void setHospitalGmail(String hospitalGmail) {
		this.hospitalGmail = hospitalGmail;
	}
	
}
