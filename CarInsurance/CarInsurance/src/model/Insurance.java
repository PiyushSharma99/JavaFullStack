package model;

public class Insurance {
	
	private String insuranceType;
	private Double premium ;
	
	public Insurance(String insuranceType )
	{
		this.insuranceType = insuranceType;
		
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}
	
	
}
