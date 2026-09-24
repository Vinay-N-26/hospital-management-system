package com.qsp.hospitalManagementSystem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.hospitalManagementSystem.dto.Hospital;
import com.qsp.hospitalManagementSystem.dto.Owner;
import com.qsp.hospitalManagementSystem.exception.DoesNotExistException;
import com.qsp.hospitalManagementSystem.repo.OwnerRepo;

@Repository
public class OwnerDao {

	@Autowired
	OwnerRepo ownerRepo;
	
	@Autowired
	HospitalDao hospitalDao;
	
	public Owner saveOwner(Owner owner) {
		return ownerRepo.save(owner);
		
	}
	
	public Owner findOwnerById(int ownerId) {
		Optional<Owner> optional= ownerRepo.findById(ownerId);
		if (optional.isPresent()) {
			return optional.get();
		}
		else {
			throw new DoesNotExistException("No such data available for ID : "+ownerId);
		}
	}
	
	public Owner deleteOwnerById(int ownerId) {
		Owner owner=findOwnerById(ownerId);
		ownerRepo.delete(owner); 
		return owner;
	}
	
	public Owner UpdateOwnerById(int oldOwnerId,Owner newOwner) {
		newOwner.setOwnerId(oldOwnerId);
		return ownerRepo.save(newOwner);
	}
	
	public List<Owner> FindAllOwners() {
		return ownerRepo.findAll();
	}
	
	public Owner addOwnerToHospital(int ownerId,int hospitalId) {
		Owner owner=findOwnerById(ownerId);
		Hospital hospital=hospitalDao.findHospitalById(hospitalId);
		owner.setHospital(hospital);
		return saveOwner(owner);
	}
}
