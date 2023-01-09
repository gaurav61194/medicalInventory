package com.medicalInventory.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicalInventory.dto.Patient;
import com.medicalInventory.services.PatientService;

@RestController
@RequestMapping("/api/v1")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patients")
	public List< Patient > getAllPatients(){
		return patientService.getAllPatient();
	}
	
	@GetMapping("/patient/{id}")
	public Optional<Patient> getPatientById(@PathVariable("id") long id){
		return patientService.getPatientById(id);
	}
	
	@PostMapping("/patient")
	public Patient addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}
	
	@PutMapping("/patient/{id}")
	public Patient updatePatientEmployee(@PathVariable("id") long id, @RequestBody Patient patient) {
		return patientService.updatePatientById(id, patient);
	}

	@DeleteMapping("/patient/{id}")
	public ResponseEntity <String> deletePatientById(@PathVariable("id") long id){
		patientService.deletePatientById(id);
		return new ResponseEntity<>("Employee deleted Sucessfully..!",HttpStatus.OK);
	}
	
}
