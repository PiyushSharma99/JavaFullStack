package Display;

import model.Car;
import model.Insurance;
import service.InsuranceCalculator;

import java.util.ArrayList;

public class DisplayElement {

    public void printElements(ArrayList<String[]> list)
    {
        for(int i=0;i<list.size(); i++)
        {
            String[] entityStrings = list.get(i);
            String carModel = entityStrings[0];
            String carType = entityStrings[1];
            String insuranceType = entityStrings[2];
            Double carCostPrice = Double.parseDouble(entityStrings[3]);

            Car car = new Car(carModel,carType,carCostPrice);
            Insurance insurance = new Insurance(insuranceType);
            Double result = InsuranceCalculator.getPremium(car, insurance);

            System.out.println("Insurance premium for car model " +car.getCarModel()
                    + " of Cost Price Rs "+car.getCarCostPrice()+
                    " = Rs. "+result);

        }
    }
}
