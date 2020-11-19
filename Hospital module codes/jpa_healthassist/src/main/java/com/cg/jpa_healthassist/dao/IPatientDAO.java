package com.cg.jpa_healthassist.dao;

import com.cg.jpa_healthassist.model.Patient;
import java.util.List;

public interface IPatientDAO {

	public void persist(Patient patient);

	public Patient findByPatientId(long id);

	public void removePatient(Patient patient);

	public List<Patient> findAll();

	public boolean update(Patient patient, String patientAddress);

	public boolean update(Patient patient, long patientPhoneNumber);
}