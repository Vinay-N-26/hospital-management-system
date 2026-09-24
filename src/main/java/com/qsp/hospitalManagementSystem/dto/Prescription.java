package com.qsp.hospitalManagementSystem.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prescriptionId;
	private String prescriptionDate;
	private String prescriptionByDoctorName;
	public int getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public String getPrescriptionDate() {
		return prescriptionDate;
	}
	public void setPrescriptionDate(String prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}
	public String getPrescriptionByDoctorName() {
		return prescriptionByDoctorName;
	}
	public void setPrescriptionByDoctorName(String prescriptionByDoctorName) {
		this.prescriptionByDoctorName = prescriptionByDoctorName;
	}
	
}
