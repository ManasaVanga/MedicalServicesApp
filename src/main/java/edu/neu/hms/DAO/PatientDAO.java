package edu.neu.hms.DAO;

import java.util.List;

import edu.neu.hms.Entity.Patient;


public interface PatientDAO {
	
	public void addPatient(Patient p);
	public void updatePatient(Patient p);
	public List<Patient> listPatient();
	public Patient getPatientById(int id);
//	public abstract void removePatient(int id);

}
