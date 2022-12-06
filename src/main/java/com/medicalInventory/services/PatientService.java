package com.medicalInventory.services;

import java.util.List;
import java.util.Optional;

import com.medicalInventory.dto.Patient;

public interface PatientService {

	public List<Patient> getAllPatient();
	
	public Optional<Patient> getPatientById(long id);
	
	public Patient addPatient(Patient patient);
	
	public Patient updatePatientById(long id, Patient patient);
	
	public void deletePatientById(long id);
	
//	

	public void delete(Patient patient);

	public Optional<Patient> findById(long id);

	

	
	

}
