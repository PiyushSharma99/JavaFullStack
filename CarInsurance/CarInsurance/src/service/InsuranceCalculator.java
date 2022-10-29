package service;

import model.Car;
import model.Insurance;
import constant.CarConstants;
import constant.PremiumConstants;

public class InsuranceCalculator {
	
	

	public static Double getPremium(Car car, Insurance insurance)
	{
		Double premium = 0.0;
		if(car.getCarType().equals("Hatchback"))
		{
			premium = CarConstants.HATCHBACK_VALUE * car.getCarCostPrice();
		
		}
		else if(car.getCarType().equals("Sedan"))
		{
			premium = CarConstants.SEDAN_VALUE * car.getCarCostPrice();
		}
		else if(car.getCarType().equals("SUV"))
		{
			premium = CarConstants.SUV_VALUE * car.getCarCostPrice();
		}
		else
		{
			return 0.0;
		}
		if(insurance.getInsuranceType().equals("Premium"))
		{
			premium += PremiumConstants.INCREASED_PREMIUM_VALUE*premium;
		}
		
		return premium;
	}

}
