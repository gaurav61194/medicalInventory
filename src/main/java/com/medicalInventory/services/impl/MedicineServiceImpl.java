package com.medicalInventory.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalInventory.dao.MedicineRepo;
import com.medicalInventory.dto.Medicine;
import com.medicalInventory.services.MedicineService;

@Service
public class MedicineServiceImpl implements MedicineService{

	@Autowired
	public MedicineRepo medicineRepo;
	
	@Override
	public List<Medicine> getmedicine(){
	return medicineRepo.findAll();
	}
	
	@Override
	public Optional<Medicine> getMedicineById(long id){
		return medicineRepo.findById(id);
	}
	
	@Override
	public Medicine addMedicine(Medicine medicine) {
		return medicineRepo.save(medicine);
	}
	
	@Override
	public Medicine updateMedicineById(long id, Medicine medicine) {
		return medicineRepo.save(id);
	}
	
	@Override
	public void deleteMedicineById(long id) {
		medicineRepo.deleteById(id);
	}
	
}
