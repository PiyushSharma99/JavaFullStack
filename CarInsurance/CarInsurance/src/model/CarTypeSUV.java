package model;

public class CarTypeSUV extends Car{

    private String carModel;
    private String carType;
    private Double carCostPrice;

    public CarTypeSUV(String carModel, String carType,Double carCostPrice) {
        super(carModel, carType,carCostPrice);
        //this.carType = carType;
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
