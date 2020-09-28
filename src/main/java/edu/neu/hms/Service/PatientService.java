package edu.neu.hms.Service;

import java.util.List;

import edu.neu.hms.Entity.Patient;

public interface PatientService {


	public void addPatient(Patient p);
	public void updatePatient(Patient p);
	public List<Patient> listPatient();
	public Patient getPatientById(int id);
	//public void removePatient(int id);
}
