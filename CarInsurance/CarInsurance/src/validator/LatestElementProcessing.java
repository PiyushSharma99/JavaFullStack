package validator;

public class LatestElementProcessing {

    private String carModel;
    private String carType;
    private String insuranceType;
    private Double carCostPrice;

    public LatestElementProcessing(String[] stringArray) {

        this.carModel = stringArray[0];
        this.carType = stringArray[1];
        this.insuranceType = stringArray[2];
        this.carCostPrice = Double.parseDouble(stringArray[3]);

    }

    public Integer processData() {
        DataValidation dataValidation = new DataValidation();

        String validateCarType = DataValidation.checkCarType(this.carType);
        int count = 0;
        while (!validateCarType.equals("Valid")) {
            System.out.println(validateCarType);
            //list.remove(list.size()-1);
//            System.out.println("Please re-enter all the values again");
            System.out.println("To re-enter values answer y to the below"
                    + " question else answer n.");
            count++;
        }
        String validateInsuranceType = DataValidation
                .checkInsuranceType(this.insuranceType);
        if (!validateInsuranceType.equals("Valid")) {
            System.out.println(validateInsuranceType);
            //list.remove(list.size()-1);
            System.out.println("Please re-enter all the values again");
            System.out.println("To re-enter values answer y to the below"
                    + " question else answer n.");
            count++;
        }
        return count;
    }
}
//            ExceptionHandling exceptionHandling = new ExceptionHandling();
//            String validateCarType = ExceptionHandling.checkCarType(carType);
//            if(!validateCarType.equals("Valid"))
//            {
//                System.out.println(validateCarType);
//                list.remove(list.size()-1);
//                System.out.println("Please re-enter all the values again");
//                System.out.println("To re-enter values answer y to the below"
//                        + " question else answer n.");
//            }
//            String validateinsuranceType = ExceptionHandling
//                    .checkInsuranceType(insuranceType);
//            if(!validateinsuranceType.equals("Valid"))
//            {
//                System.out.println(validateinsuranceType);
//                list.remove(list.size()-1);
//                System.out.println("Please re-enter all the values again");
//                System.out.println("To re-enter values answer y to the below"
//                        + " question else answer n.");
//            }
//
//        }
//    }
//}
