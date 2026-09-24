package com.qsp.hospitalManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.hospitalManagementSystem.dao.OwnerDao;
import com.qsp.hospitalManagementSystem.dto.Hospital;
import com.qsp.hospitalManagementSystem.dto.Owner;
import com.qsp.hospitalManagementSystem.util.ResponseStructure;

@Service
public class OwnerService {

	@Autowired
	OwnerDao ownerDao;
	
	
	public ResponseEntity<ResponseStructure<Owner>> saveOwner(Owner owner) {
		Owner own=ownerDao.saveOwner(owner);
		ResponseStructure<Owner> responseStructure = new ResponseStructure<Owner>(HttpStatus.CREATED.value(),"Owner Saved Succesfully...",own);
		return new ResponseEntity<ResponseStructure<Owner>>(responseStructure,HttpStatus.CREATED);
	}
	
	public ResponseEntity<ResponseStructure<Owner>> findOwnerById(int ownerId) {
		Owner oId= ownerDao.findOwnerById(ownerId);
		ResponseStructure<Owner> responseStructure=new ResponseStructure<Owner>(HttpStatus.FOUND.value(),"Owner Found successfully",oId);
		return new ResponseEntity<ResponseStructure<Owner>>(responseStructure,HttpStatus.FOUND);
	}
	
	public ResponseEntity<ResponseStructure<Owner>> deleteOwnerById(int ownerId) {
		Owner oId=ownerDao.deleteOwnerById(ownerId);
		ResponseStructure<Owner> responseStructure = new ResponseStructure<Owner>(HttpStatus.OK.value(),"Deleted sucessfully",oId);
		return new ResponseEntity<ResponseStructure<Owner>>(responseStructure,HttpStatus.OK);
	}
	
	public Owner updateOwnerById(int oldOwner,Owner newOwner) {
		return ownerDao.UpdateOwnerById(oldOwner, newOwner);
	}
	
	public List<Owner> findAllOwners() {
		return ownerDao.FindAllOwners();
	}
	
	public Owner addOwnerToHospital(int ownerId,int hospitalId) {
		return ownerDao.addOwnerToHospital(ownerId, hospitalId);
	}
}
