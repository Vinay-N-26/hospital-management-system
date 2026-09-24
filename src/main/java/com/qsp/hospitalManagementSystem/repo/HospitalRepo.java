package com.qsp.hospitalManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.hospitalManagementSystem.dto.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Integer>{

}
