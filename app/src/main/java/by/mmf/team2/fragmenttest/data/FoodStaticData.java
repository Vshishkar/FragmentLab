package by.mmf.team2.fragmenttest.data;

import java.util.ArrayList;
import java.util.List;

public class FoodStaticData {

     private static List<Food> foodList = new ArrayList<>();

    static {
        foodList.add(new Food("apple","an apple a day keeps doctor away"));
        foodList.add(new Food("pizza","everybody likes it :)"));
        foodList.add(new Food("meat","please don't be vegetarian (i'm kidding)"));
    }

    public static List<Food> getFoodList() {
        return foodList;
    }
}
