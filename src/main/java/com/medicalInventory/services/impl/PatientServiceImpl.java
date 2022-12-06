package com.medicalInventory.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalInventory.dao.PatientRepo;
import com.medicalInventory.dto.Patient;
import com.medicalInventory.services.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepo patientRepo;
	
	@Override
	public List<Patient> getAllPatient(){
		return patientRepo.findAll();
	}
	
	@Override
	public Optional<Patient> getPatientById(long id){
		return patientRepo.findById(id);
	}
	
	@Override
	public Patient addPatient(Patient patient) {
		return patientRepo.save(patient);
	}
	
	@Override
	public Patient updatePatientById(long id, Patient patient) {
		return patientRepo.save(patient);
	}
	
	@Override
	public void deletePatientById(long id) {
		patientRepo.deleteById(id);
	}

	@Override
	public void delete(Patient patient) {
		patientRepo.delete(patient);
	}

	@Override
	public Optional<Patient> findById(long id) {
		return patientRepo.findById(id);
	}
	

}
