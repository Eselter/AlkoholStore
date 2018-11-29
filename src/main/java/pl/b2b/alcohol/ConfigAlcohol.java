package pl.b2b.alcohol;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConfigAlcohol {

    public String expensiveAlcohol(List<Alcohol> alcohols) {
        Alcohol max = Collections.max(alcohols);

//        Alcohol result = alcohols.get(0);
//
//        for (Alcohol alcohol : alcohols) {
//            if (alcohol.getPrice() > result.getPrice()) {
//                result = alcohol;
//            }
//        }

        return max.getName();
    }

    public String cheapAlcohol(List<Alcohol> alcohols) {

        Alcohol result = alcohols.get(0);

        for (Alcohol alcohol : alcohols) {
            if (alcohol.getPrice() < result.getPrice()) {
                result = alcohol;
            }
        }

        return result.getName();
    }

    public double averagePrice(List<Alcohol> alcohols) {
        double result = 0;
        for (Alcohol alcohol : alcohols) {
            result += alcohol.getPrice();
        }

        result /= alcohols.size();
        return result;
    }

    public List<String> namesOfAlcoholsWitchPriceIsHigherThanAverage(List<Alcohol> alcohols) {
        double avgPrice = averagePrice(alcohols);
        List<String> result = new ArrayList<>();

        for (Alcohol alcohol : alcohols) {
            if (alcohol.getPrice() > avgPrice) {
                result.add(alcohol.getName());
            }
        }
        return result;
    }

    public String nameAndPrice(Alcohol alcohol) {
        return alcohol.getName() + " " + alcohol.getPrice();
    }

    public List<String> nameAndPriceBelowAveragePrice(List<Alcohol> alcohols) {
        double avgPrice = averagePrice(alcohols);
        List<String> result = new ArrayList<>();

        for (Alcohol alcohol : alcohols) {
            if (alcohol.getPrice() < avgPrice) {
                result.add(nameAndPrice(alcohol));
            }
        }
        return result;
    }

}
