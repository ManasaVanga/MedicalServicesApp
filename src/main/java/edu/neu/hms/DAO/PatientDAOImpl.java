package edu.neu.hms.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.neu.hms.Entity.Patient;

@Repository
public class PatientDAOImpl implements PatientDAO{

	private static final Logger logger = LoggerFactory.getLogger(PatientDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addPatient(Patient p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Patient Saved Successfully- "+p);
		
	}

	@Override
	public void updatePatient(Patient p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Patient updated successfully, Patient Details="+p);
		
	}

	@Override
	public List<Patient> listPatient() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Patient> personsList = session.createQuery("from patient_info").list();
		for(Patient p : personsList){
			logger.info("Patient List::"+p);
		}
		return personsList;
	}

	@Override
	public Patient getPatientById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Patient p = (Patient) session.load(Patient.class, new Integer(id));
		logger.info("Patient loaded successfully, Patient details="+p);
		return p;
	}

//	@Override
//	public void removePatient(int id) {
//		// TODO Auto-generated method stub
//		
//	}

}
