package com.qsp.hospitalManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.hospitalManagementSystem.dto.Hospital;
import com.qsp.hospitalManagementSystem.dto.Owner;
import com.qsp.hospitalManagementSystem.service.OwnerService;
import com.qsp.hospitalManagementSystem.util.ResponseStructure;

import jakarta.websocket.server.PathParam;

@RestController
public class OwnerController {

	@Autowired
	OwnerService ownerService;
	
	@PostMapping("/saveOwner")
	public ResponseEntity<ResponseStructure<Owner>> saveOwner(@RequestBody Owner owner) {
		return ownerService.saveOwner(owner);
	}
	
	@GetMapping("/findOwner")
	public ResponseEntity<ResponseStructure<Owner>> findOwnerByid(@RequestParam int ownerId) {
		return ownerService.findOwnerById(ownerId);
	}
	
	@DeleteMapping("/deleteOwner")
	public ResponseEntity<ResponseStructure<Owner>> deleteOwnerById(@RequestParam int ownerId) {
		return ownerService.deleteOwnerById(ownerId);
	}
	
	@PutMapping("/updateOwnerById")
	public Owner updateOwnerById(@RequestParam int oldOwner,@RequestBody Owner newOwner) {
		return ownerService.updateOwnerById(oldOwner, newOwner);
	}
	
	@GetMapping("/findAllOwner")
	public List<Owner> findAllOwner() {
		return ownerService.findAllOwners();
	}
	
	@PutMapping("/addOwnerToHospital/{ownerId}/{hospitalId}")
	public Owner addOwnerToHospital(@PathVariable int ownerId,@PathVariable int hospitalId) {
		return ownerService.addOwnerToHospital(ownerId, hospitalId);
	}
}
