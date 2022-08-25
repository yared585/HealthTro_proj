package com.learning.pojo;

import java.util.Comparator;

public class ComparatorForSorting implements Comparator { 
	@Override
	public int compare(Object o1, Object o2) {
	
		HealthData_Dto d1 = (HealthData_Dto)o1;
		HealthData_Dto d2 = (HealthData_Dto)o2;
		
		return d2.getRegion().compareTo(d1.getRegion());
	}
	
}
