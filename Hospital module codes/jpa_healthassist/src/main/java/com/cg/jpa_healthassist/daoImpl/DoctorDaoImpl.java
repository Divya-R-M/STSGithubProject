package com.cg.jpa_healthassist.daoImpl;

import java.util.List;

import com.cg.jpa_healthassist.dao.IDoctorDao;
import com.cg.jpa_healthassist.model.Doctor;
import com.cg.jpa_healthassist.model.Patient;
import com.cg.jpa_healthassist.util.JPAUtil;

public class DoctorDaoImpl extends JPAUtil implements IDoctorDao {

	@Override
	public void persist(Doctor doctor) {
		// TODO Auto-generated method stub

	}

	@Override
	public Doctor findByDoctorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeDoctor(Doctor doctor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean update(Patient patient, long doctorPhNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
