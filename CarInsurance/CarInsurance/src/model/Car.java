package model;

public class Car {

	private String carModel;
	private String carType;
	private Double carCostPrice;

	public Car(String carModel, String carType, Double carCostPrice)
	{
		this.carModel = carModel;
		this.carType = carType;
		this.carCostPrice = carCostPrice;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Double getCarCostPrice() {
		return carCostPrice;
	}

	public void setCarCostPrice(Double carCostPrice) {
		this.carCostPrice = carCostPrice;
	}
	
	
}
