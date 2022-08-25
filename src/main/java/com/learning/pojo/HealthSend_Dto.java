package com.learning.pojo;

public class HealthSend_Dto {

	private String region;
	private String region_code;
	private String period;
	private String pct_hospitals_mu;
	public HealthSend_Dto() {
		super();
		
	}
	
	public HealthSend_Dto(HealthData_Dto healthData_Dto) {
		super();
		this.region = healthData_Dto.getRegion();
		this.region_code = healthData_Dto.getRegion_code();
		this.period = healthData_Dto.getPeriod();
		this.pct_hospitals_mu = healthData_Dto.getPct_hospitals_mu();
	}


	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegion_code() {
		return region_code;
	}
	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getPct_hospitals_mu() {
		return pct_hospitals_mu;
	}
	public void setPct_hospitals_mu(String pct_hospitals_mu) {
		this.pct_hospitals_mu = pct_hospitals_mu;
	}
	
	
}
