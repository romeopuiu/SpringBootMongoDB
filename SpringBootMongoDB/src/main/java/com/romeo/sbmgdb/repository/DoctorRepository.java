package com.romeo.sbmgdb.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.romeo.sbmgdb.document.Doctor;

public interface DoctorRepository extends MongoRepository<Doctor,Long>  {         
	
	Doctor findByDoctNo(String doctNo);
	
	
	List<Doctor> findByFullNameLike(String fullName);
	
	
	
	List<Doctor> findByHireDateGreaterThan(Date hireDate);
	
	
	@Query("{fullName:'?0'}")
	List<Doctor> findCustomByFullName(String fullName);
	
	
	
	

}
