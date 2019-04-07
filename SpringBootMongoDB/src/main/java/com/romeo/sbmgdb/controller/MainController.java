package com.romeo.sbmgdb.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.romeo.sbmgdb.document.Doctor;
import com.romeo.sbmgdb.repository.DoctorCustomRepository;
import com.romeo.sbmgdb.repository.DoctorRepository;

@Controller
public class MainController {

	
	
	private static final String[] NAMES = {"Robert", "Brandon", "Andrei"};
	
	
	@Autowired
	private DoctorCustomRepository doctorCustomRepository;
	
	 @Autowired
	    private DoctorRepository   doctorRepository;
	
	
	
	@RequestMapping("/")
	public String home() {
		
		
		return "home";
	}
	
	
	
	
	
    @RequestMapping("/insertdoctor")
    public String testInsert() {
        Doctor doctor = new Doctor();
 
        long id = this.doctorCustomRepository.getMaxDoctId() + 1;
        int idx = (int) (id % NAMES.length);
        String fullName = NAMES[idx] + " " + id;
 
        doctor.setId(id);
        doctor.setDoctNo("Ro" + id);
        doctor.setFullName(fullName);
        doctor.setHireDate((new Date()));
        this.doctorRepository.insert(doctor);
 
        
        return "insertdoctor";
    }
 
//    @ResponseBody
    @RequestMapping("/showAllDoctors")
    public String showAllDoctors(Model model) {
 
        List<Doctor> doctors = this.doctorRepository.findAll();
 
     
        model.addAttribute("doctors", doctors);
        
        
        
        return "showAllDoctors";
    }
 

    @RequestMapping("/showFullNameLikeRobert")
    public String showFullNameLikeTom(Model model) {
 
        List<Doctor> doctors = this.doctorRepository.findByFullNameLike("Robert");
 

        model.addAttribute("doctors", doctors);
 
        return "showFullNameLikeRobert";
    }
 
  
    @RequestMapping("/deleteAllDoctors")
    public String deleteAllDoctors() {
 
    	  this.doctorRepository.deleteAll();
    
    	  return "deleteAllDoctors";
        
        
        
    }
	
	
	
	
	
	
	
	
}
