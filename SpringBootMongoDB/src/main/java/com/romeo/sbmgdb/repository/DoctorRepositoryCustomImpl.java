package com.romeo.sbmgdb.repository;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.mongodb.client.result.UpdateResult;
import com.romeo.sbmgdb.document.Doctor;


@Repository
public class DoctorRepositoryCustomImpl implements DoctorCustomRepository{
	
	
	@Autowired
    MongoTemplate mongoTemplate;
 
 
    @Override
    public long updateDoctor(String doctNo, String fullName, Date hireDate) {
        Query query = new Query(Criteria.where("doctNo").is(doctNo));
        Update update = new Update();
        update.set("fullName", fullName);
        update.set("hireDate", hireDate);
 
        UpdateResult result = this.mongoTemplate.updateFirst(query, update, Doctor.class);
 
        if (result != null) {
            return result.getModifiedCount();
        }
 
        return 0;
    }

	@Override
	public long getMaxDoctId() {
		 Query query = new Query();
	        query.with(new Sort(Sort.Direction.DESC, "id"));
	        query.limit(1);
	        Doctor maxObject = mongoTemplate.findOne(query, Doctor.class);
	        if (maxObject == null) {
	            return 0L;
	        }
	        return maxObject.getId();
		
	}
	

}
