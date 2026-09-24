package com.qsp.hospitalManagementSystem.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ambulance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ambulanceId;
	private String ambulanceRegNo;
	private String ambulanceType;
	public int getAmbulanceId() {
		return ambulanceId;
	}
	public void setAmbulanceId(int ambulanceId) {
		this.ambulanceId = ambulanceId;
	}
	public String getAmbulanceRegNo() {
		return ambulanceRegNo;
	}
	public void setAmbulanceRegNo(String ambulanceRegNo) {
		this.ambulanceRegNo = ambulanceRegNo;
	}
	public String getAmbulanceType() {
		return ambulanceType;
	}
	public void setAmbulanceType(String ambulanceType) {
		this.ambulanceType = ambulanceType;
	}
	
}
