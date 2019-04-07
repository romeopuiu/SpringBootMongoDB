package com.romeo.sbmgdb.repository;

import java.util.Date;

public interface DoctorCustomRepository {

	
	public long getMaxDoctId();
	
	public long updateDoctor(String doctNo, String fullName, Date hireDate);
	
	
}
