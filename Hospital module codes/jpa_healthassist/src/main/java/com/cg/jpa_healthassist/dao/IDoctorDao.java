package com.cg.jpa_healthassist.dao;

import java.util.List;

import com.cg.jpa_healthassist.model.Doctor;
import com.cg.jpa_healthassist.model.Patient;

public interface IDoctorDao {

	public void persist(Doctor doctor);
	
	public Doctor findByDoctorId(Long id);
	
	public List<Doctor> findAll();
	
	public void removeDoctor(Doctor doctor);
	
	public void addDoctor(Doctor doctor);
	
	public boolean update(Patient patient, long doctorPhNo);
	
}
