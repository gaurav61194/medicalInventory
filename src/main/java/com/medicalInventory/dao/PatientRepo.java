package com.medicalInventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicalInventory.dto.Patient;

@Repository
public interface PatientRepo extends JpaRepository< Patient, Long>{

}
