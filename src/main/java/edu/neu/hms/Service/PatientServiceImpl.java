package edu.neu.hms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.neu.hms.DAO.PatientDAO;
import edu.neu.hms.Entity.Patient;

@Service
public class PatientServiceImpl implements PatientService{
	
	//@Autowired
	private PatientDAO patientDAO;
	
	
	  @Autowired(required=true)
	  
	  @Qualifier(value="patientDAO")
	 
	public void setPatientDAO(PatientDAO patientDAO) {
		this.patientDAO = patientDAO;
	}

	@Override
	@Transactional
	public void addPatient(Patient p) {
		this.patientDAO.addPatient(p);
		
	}

	@Override
	@Transactional
	public void updatePatient(Patient p) {
		this.patientDAO.updatePatient(p);
		
	}

	@Override
	@Transactional
	public List<Patient> listPatient() {
		
		return this.patientDAO.listPatient();
	}

	@Override
	@Transactional
	public Patient getPatientById(int id) {
		
		return this.patientDAO.getPatientById(id);
	}

}
