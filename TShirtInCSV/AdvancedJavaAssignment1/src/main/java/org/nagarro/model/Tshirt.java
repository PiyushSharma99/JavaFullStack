package org.nagarro.model;

import java.util.Comparator;

public class Tshirt {
    private String tshirtID;
    private String tshirtName;
    private String tshirtColor;
    private String tshirtGenderRecommendation;
    private String tshirtSize;
    private String tshirtPrice;
    private String tshirtRating;
    private String tshirtAvailability;

    public String getId() {
        return tshirtID;
    }

    public void setId(String tshirtID) {
        this.tshirtID = tshirtID;
    }

    public String getName() {
        return tshirtName;
    }

    public void setName(String tshirtName) {
        this.tshirtName = tshirtName;
    }

    public String getColor() {
        return tshirtColor;
    }

    public void setColor(String tshirtColor) {
        this.tshirtColor = tshirtColor;
    }

    public String getGenderRecommendation() {
        return tshirtGenderRecommendation;
    }

    public void setGenderRecommendation(String tshirtGenderRecommendation) {
        this.tshirtGenderRecommendation = tshirtGenderRecommendation;
    }

    public String getSize() {
        return tshirtSize;
    }

    public void setSize(String tshirtSize) {
        this.tshirtSize = tshirtSize;
    }

    public String getPrice() {
        return tshirtPrice;
    }

    public void setPrice(String tshirtPrice) {
        this.tshirtPrice = tshirtPrice;
    }

    public String getRating() {
        return tshirtRating;
    }

    public void setRating(String tshirtRating) {
        this.tshirtRating = tshirtRating;
    }

    public String getAvailability() {
        return tshirtAvailability;
    }

    public void setAvailability(String availability) {
        this.tshirtAvailability = availability;
    }

    public static Comparator<Tshirt> ratingSorter =  new Comparator<Tshirt>() {
        @Override
        public int compare(Tshirt obj1, Tshirt obj2) {
            double obj1Rating = Double.parseDouble(obj1.getRating());
            double obj2Rating = Double.parseDouble(obj2.getRating());
            return Double.compare(obj1Rating,obj2Rating);
        }
    };

    public static Comparator<Tshirt> priceSorter =  new Comparator<Tshirt>() {
        @Override
        public int compare(Tshirt obj1, Tshirt obj2) {
            double obj1Price = Double.parseDouble(obj1.getPrice());
            double obj2Price = Double.parseDouble(obj2.getPrice());
            return Double.compare(obj1Price,obj2Price);
        }
    };

    public static Comparator<Tshirt> priceAndRatingSorter = new Comparator<Tshirt>() {
        @Override
        public int compare(Tshirt obj1, Tshirt obj2) {
            double obj1Price = Double.parseDouble(obj1.getPrice());
            double obj2Price = Double.parseDouble(obj2.getPrice());
            double obj1Rating = Double.parseDouble(obj1.getRating());
            double obj2Rating = Double.parseDouble(obj2.getRating());
            int result = Double.compare(obj1Price, obj2Price);
            if(result == 0) {
                result = Double.compare(obj1Rating,obj2Rating);
            }
            return result;
        }
    };
}
