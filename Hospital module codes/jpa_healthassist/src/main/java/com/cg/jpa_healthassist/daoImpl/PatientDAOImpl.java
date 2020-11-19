package com.cg.jpa_healthassist.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.jpa_healthassist.dao.IPatientDAO;
import com.cg.jpa_healthassist.exception.BedNumNotFoundException;
import com.cg.jpa_healthassist.model.Bed;
import com.cg.jpa_healthassist.model.Patient;
import com.cg.jpa_healthassist.util.JPAUtil;

//implements the PatientDao interface to define methods
public class PatientDAOImpl extends JPAUtil implements IPatientDAO {

	@Override
	public void persist(Patient patient) {
		EntityManager em = getEntityManager();
		beginTransaction(em);
		em.persist(patient);
		commitTransaction(em);
		closeEntityManager(em);
	}

	@Override
	public Patient findByPatientId(long patientId) {
		EntityManager em = getEntityManager();
		beginTransaction(em);
		Patient patient = em.find(Patient.class, patientId);
		commitTransaction(em);
		closeEntityManager(em);
		return patient;
	}

	@Override
	public void removePatient(Patient patient) {
		EntityManager em = getEntityManager();
		beginTransaction(em);
		em.remove(patient);
		closeEntityManager(em);
	}

	@Override
	public List<Patient> findAll() {
		EntityManager em = getEntityManager();
		beginTransaction(em);
		Query query = em.createQuery("from Patient");
		List<Patient> patientList = query.getResultList();
		if (patientList.size() != 0) {
			return patientList;
		} else {
			return null;
		}
	}

	@Override
	public boolean update(Patient patient, String patientAddress) {
		EntityManager em = getEntityManager();
		beginTransaction(em);
		Patient patientToUpdate = em.find(Patient.class, patient.getPatientId());
		commitTransaction(em);
		closeEntityManager(em);
		if (patientToUpdate == null) {
			return false;
		} else {
			patientToUpdate.setPatientAddress(patientAddress);
			return true;
		}

	}

	@Override
	public boolean update(Patient patient, long patientPhoneNumber) {
		EntityManager em = getEntityManager();
		beginTransaction(em);
		Patient patientToUpdate = em.find(Patient.class, patient.getPatientId());
		commitTransaction(em);
		closeEntityManager(em);
		if (patientToUpdate == null) {
			return false;
		} else {
			patientToUpdate.setPhoneNumber(patientPhoneNumber);
			return true;
		}
	}

}