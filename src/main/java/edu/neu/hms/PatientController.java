package edu.neu.hms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.neu.hms.Entity.Patient;
import edu.neu.hms.Service.PatientService;

@Controller
@RequestMapping(value = "/")
public class PatientController {
	
	private PatientService patientservice;
	
	@Autowired(required=true)
	@Qualifier(value="patientservice")
	public void setPatientService(PatientService ps){
		this.patientservice = ps;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	   public ModelAndView patient() {
	      return new ModelAndView("patient");
	   }
	
	@RequestMapping(value = "/patient", method = RequestMethod.GET)
	public String listPatients(Model model) {
		model.addAttribute("patient", new Patient());
		model.addAttribute("listPatients", this.patientservice.listPatient());
		return "home";
	}
	
	//For add and update patient both
	@RequestMapping(value= "/patient/add", method = RequestMethod.GET)
	public String addPatient(@ModelAttribute("patient") Patient p){
		
		if(p.getId() == 0){
			//new Patient, add it
			this.patientservice.addPatient(p);;
		}else{
			//existing Patient, call update
			this.patientservice.updatePatient(p);;
		}
		
		return "redirect:/patient";
		
	}
	
	/*
	 * @RequestMapping("/remove/{id}") public String
	 * removePatient(@PathVariable("id") int id){
	 * 
	 * this.patientservice.removePatient(id); return "redirect:/patient"; }
	 */
 
    @RequestMapping("/edit/{id}")
    public String editPatient(@PathVariable("id") int id, Model model){
        model.addAttribute("patient", this.patientservice.getPatientById(id));
        model.addAttribute("listPersons", this.patientservice.listPatient());
        return "patient";
    }

}
