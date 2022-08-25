package com.learning.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.Repo.HealthRepository;
import com.learning.pojo.HealthData_Dto;
import com.learning.pojo.ComparatorForSorting;

@Service
public class HealthServiceImpl implements HealthService {

	@Autowired
	private HealthRepository healthRepository;
	
	//calling repo sorting the health data by city  
	@Override
	public List<HealthData_Dto> getSortedByRegion() {
		
		   //calling the repo and converting to ArrayList
		List<HealthData_Dto> healthDatatoList = Arrays.asList(healthRepository.getAllHealth());
		
		//using stream so that we can filter the data by year  
		healthDatatoList = healthDatatoList.stream().filter(health-> health.getRegion_code()!= null && health.getPeriod().trim().equals("2014")).collect(Collectors.toList());
		
		// use comparator class for sorting 
		ComparatorForSorting sort = new ComparatorForSorting();
		
		Collections.sort(healthDatatoList, sort);
		
		return healthDatatoList;
	}

}
