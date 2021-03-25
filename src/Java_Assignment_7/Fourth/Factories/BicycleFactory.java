package Java_Assignment_7.Fourth.Factories;

import Java_Assignment_7.Fourth.Models.Bicycle;

import java.util.ArrayList;

public class BicycleFactory {
    ArrayList<Bicycle> bicycleArrayList;

    public BicycleFactory() {
        this.bicycleArrayList = new ArrayList<>();
    }

    public void add(Bicycle bicycle){
        this.bicycleArrayList.add(bicycle);
    }
}
