package com.learning.controller;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.learning.pojo.HealthData_Dto;
import com.learning.pojo.HealthSend_Dto;
import com.learning.service.HealthService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	HealthService healthService;
	
	@GetMapping("/Api")
	public List<HealthSend_Dto> getAllData(){
				
	// displaying the data in the Console, we can also display the output using the above api in a browser or postman 	
		List<HealthData_Dto> alldata = healthService.getSortedByRegion();
		Iterator it = alldata.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// filtered output with the given requirement 
		List<HealthSend_Dto> respondData =  healthService.getSortedByRegion().stream().map(health -> new HealthSend_Dto(health)).collect(Collectors.toList());
		return respondData;
	}
}
