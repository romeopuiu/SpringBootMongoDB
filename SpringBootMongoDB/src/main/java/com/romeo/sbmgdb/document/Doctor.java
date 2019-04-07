package com.romeo.sbmgdb.document;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Doctor")
public class Doctor {
	
	
	 @Id
	    private Long id;
	 
	    @Indexed(unique = true)
	    @Field(value = "Doct_No")
	    private String doctNo;
	 
	    @Field(value = "Full_Name")
	    private String fullName;
	 
	    @Field(value = "Hire_Date")
	    private Date hireDate;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDoctNo() {
			return doctNo;
		}

		public void setDoctNo(String doctNo) {
			this.doctNo = doctNo;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public Date getHireDate() {
			return hireDate;
		}

		public void setHireDate(Date hireDate) {
			this.hireDate = hireDate;
		}
	    
	    
	    

	
	
	    
	    

}
