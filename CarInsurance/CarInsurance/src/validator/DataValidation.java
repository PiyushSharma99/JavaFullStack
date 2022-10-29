package validator;

import java.util.HashSet;

public class DataValidation {


	public static String checkCarType(String carType)
	{
		HashSet<String> setOfCarType = new HashSet<>();
		setOfCarType.add("SUV");
		setOfCarType.add("Sedan");
		setOfCarType.add("Hatchback");

		if(!setOfCarType.contains(carType))
		{
					return "Enter car type as SUV, Sedan or Hatchback";
		}
		
		return "Valid";
	}
	
	public static String checkInsuranceType(String insuranceType)
	{
		HashSet<String> setOfInsuranceType = new HashSet<>();
		setOfInsuranceType.add("Basic");
		setOfInsuranceType.add("Premium");

		if(!setOfInsuranceType.contains(insuranceType))
		{
					return "Enter insurance type as Basic or Premium";
		}
		
		return "Valid";
	}
}
