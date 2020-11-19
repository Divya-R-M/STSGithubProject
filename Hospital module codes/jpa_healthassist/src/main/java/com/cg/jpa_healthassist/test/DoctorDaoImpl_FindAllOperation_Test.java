package com.cg.jpa_healthassist.test;

import com.cg.jpa_healthassist.dao.IDoctorDao;
import com.cg.jpa_healthassist.daoImpl.DoctorDaoImpl;
import com.cg.jpa_healthassist.model.Doctor;
public class DoctorDaoImpl_FindAllOperation_Test {

	public static void main(String[] args) {
		IDoctorDao doctorDao=new DoctorDaoImpl();
		Doctor doctor = doctorDao.findByDoctorId(2L);
		System.out.println(doctor);
	}

}
