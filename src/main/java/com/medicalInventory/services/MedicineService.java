package com.medicalInventory.services;

import java.util.List;
import java.util.Optional;

import com.medicalInventory.dto.Medicine;

public interface MedicineService {

	public List<Medicine> getmedicine();

	public Optional<Medicine> getMedicineById(long id);

	public Medicine addMedicine(Medicine medicine);

	public Medicine updateMedicineById(long id, Medicine medicine);

	public void deleteMedicineById(long id);

}
