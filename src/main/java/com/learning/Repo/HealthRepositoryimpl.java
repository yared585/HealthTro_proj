package com.learning.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.learning.pojo.HealthData_Dto;
import com.learning.pojo.HealthSend_Dto;

@Repository
public class HealthRepositoryimpl implements HealthRepository {

	@Autowired
	private RestTemplate restTemplate;
	
	// accessing the Api from the Url using resTempleate 
	@Override
	public HealthData_Dto[] getAllHealth() {
		
		     // returning the data in in built in restTemplate Array 
		return restTemplate.getForEntity("https://www.healthit.gov/data/open-api?source=Meaningful-Use-Acceleration-Scorecard.csv", HealthData_Dto[].class).getBody();
	}

}
