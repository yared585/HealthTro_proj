package com.learning.service;

import java.util.List;

import com.learning.pojo.HealthData_Dto;

public interface HealthService {
   
	public List<HealthData_Dto> getSortedByRegion();
}
