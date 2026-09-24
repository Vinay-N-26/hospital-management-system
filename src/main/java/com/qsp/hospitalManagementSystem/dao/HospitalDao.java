package com.qsp.hospitalManagementSystem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.hospitalManagementSystem.dto.Branch;
import com.qsp.hospitalManagementSystem.dto.Hospital;
import com.qsp.hospitalManagementSystem.exception.DoesNotExistException;
import com.qsp.hospitalManagementSystem.repo.HospitalRepo;

@Repository
public class HospitalDao {

	@Autowired
	HospitalRepo hospitalRepo;
	
	@Autowired
	BranchDao branchDao;
	
	public Hospital saveHospital(Hospital hospital) {
		return hospitalRepo.save(hospital);
	}
	
	public Hospital findHospitalById(int hospitalId) {
		Optional<Hospital> optional= hospitalRepo.findById(hospitalId);
		if (optional.isPresent()) {
			return optional.get();
		}
		else {
			throw new DoesNotExistException("No such hospital found with certain ID : "+hospitalId);
		}
	}
	
	public Hospital deleteHospital(int hospitalId) {
		Hospital hospital=findHospitalById(hospitalId);
		hospitalRepo.delete(hospital);
		return hospital;
	}
	
	public List<Hospital> findAllHospital() {
		return hospitalRepo.findAll();
	}
	
	public Hospital updateHospital(int oldHospitalId,Hospital newHospital) {
		newHospital.setHospitalId(oldHospitalId);
		return hospitalRepo.save(newHospital);	
	}
	
	public Hospital addHospitalToBranch(int hospitalId,int branchId) {
		Hospital hospital=findHospitalById(hospitalId);
		Branch branch=branchDao.findBranchById(branchId);
		List<Branch> list=hospital.getBranch();
		list.add(branch);
		return saveHospital(hospital);
		
	}
}
