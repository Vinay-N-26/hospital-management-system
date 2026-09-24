package com.qsp.hospitalManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.hospitalManagementSystem.dto.Hospital;
import com.qsp.hospitalManagementSystem.service.HospitalService;

@RestController
public class HospitalController {

	@Autowired
	HospitalService hospitalService;
	
	@PostMapping("/saveHospital")
	public Hospital saveHospital(@RequestBody Hospital hospital) {
		return hospitalService.saveHospital(hospital);
	}
	
	@GetMapping("/findHospitalById")
	public Hospital findHospitalById(int hospital) {
		return hospitalService.findHospitalById(hospital);
	}
	
	@PutMapping("/updateHospital")
	public Hospital updateHospital(@RequestParam int oldHospitalId,@RequestBody Hospital newHospital) {
		return hospitalService.updateHospital(oldHospitalId, newHospital);
	}
	
	@DeleteMapping("/deleteHospital")
	public Hospital deleteHospital(int hospital) {
		return hospitalService.deleteHospital(hospital);
	}
	
	@GetMapping("/findAllHospital")
	public List<Hospital> findAllHospital() {
		return hospitalService.findAllHospital();
	}
	
	@PutMapping("/addHospitalToBranch/{hospitalId}/{branchId}")
	public Hospital addHospitalToBranch(@PathVariable int hospitalId,@PathVariable int branchId) {
		return hospitalService.addHospitalToBranch(hospitalId, branchId);
	}
}
