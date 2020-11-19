package com.cg.jpa_healthassist.dao;

import java.util.List;

import com.cg.jpa_healthassist.exception.BedNumNotFoundException;
import com.cg.jpa_healthassist.model.Bed;

public interface IBedDao {

	public Bed addBed(Bed bed);
	public Bed removeBed(int bedId) throws BedNumNotFoundException; 
	public Bed updateBed(int bedId, Bed bed) throws BedNumNotFoundException;
	public List<Bed> getAllBeds(); 
}
