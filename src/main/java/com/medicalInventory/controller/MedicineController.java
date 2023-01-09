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

import com.medicalInventory.dto.Medicine;
import com.medicalInventory.services.MedicineService;

@RestController
@RequestMapping("/api/v1/")
public class MedicineController {

	@Autowired
	MedicineService medicineService;
	
	@GetMapping("/medicines")
	public List<Medicine> getMedicine(){
		return medicineService.getmedicine();
	}
	
	@GetMapping("/medicine/{id}")
	public Optional<Medicine> getMedicineById(@PathVariable("id") long id){
		return medicineService.getMedicineById(id);
	}
	
	@PostMapping("/medicine")
	public Medicine addMedicine(@RequestBody Medicine medicine) {
	return medicineService.addMedicine(medicine);	
	}
	
	@PutMapping("/medicine/{id}")
	public Medicine updateMedicine(@PathVariable("id") long id, @RequestBody Medicine medicine) {
		return medicineService.updateMedicineById(id, medicine);
	}
	
	@DeleteMapping("/medicine/{id}")
	public ResponseEntity <String> deleteMedicineById(@PathVariable("id") long id){
		medicineService.deleteMedicineById(id);
		return new ResponseEntity<>("Medicine deleted Sucessfully..!", HttpStatus.OK);
	}
	
}
