package com.qsp.hospitalManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.hospitalManagementSystem.dao.HospitalDao;
import com.qsp.hospitalManagementSystem.dto.Branch;
import com.qsp.hospitalManagementSystem.dto.Hospital;

@Service
public class HospitalService {

	@Autowired
	HospitalDao hospitalDao;
	
	public Hospital saveHospital(Hospital hospital) {
		return hospitalDao.saveHospital(hospital);
	}
	
	public Hospital addHospitalToBranch(int hospitalId,int branchId) {
		return hospitalDao.addHospitalToBranch(hospitalId, branchId);
	}
	
	public Hospital findHospitalById(int hospital) {
		return hospitalDao.findHospitalById(hospital);
	}
	
	public List<Hospital> findAllHospital() {
		return hospitalDao.findAllHospital();
	}
	
	public Hospital deleteHospital(int hospital) {
		return hospitalDao.deleteHospital(hospital);
	}
	
	public Hospital updateHospital(int oldHospitalId,Hospital newHospital) {
		return hospitalDao.updateHospital(oldHospitalId, newHospital);
	}
}
