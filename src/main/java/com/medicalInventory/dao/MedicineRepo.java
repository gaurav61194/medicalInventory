package com.medicalInventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicalInventory.dto.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine, Long>{

	public Medicine save(long id);

}
