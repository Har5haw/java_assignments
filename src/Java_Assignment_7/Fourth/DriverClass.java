package Java_Assignment_7.Fourth;

import Java_Assignment_7.Fourth.Factories.BicycleFactory;
import Java_Assignment_7.Fourth.Factories.TricycleFactory;
import Java_Assignment_7.Fourth.Factories.UnicycleFactory;
import Java_Assignment_7.Fourth.Models.Bicycle;
import Java_Assignment_7.Fourth.Models.Tricycle;
import Java_Assignment_7.Fourth.Models.Unicycle;

public class DriverClass {
    public static void main(String[] args) {
        BicycleFactory bicycleFactory = new BicycleFactory();
        TricycleFactory tricycleFactory = new TricycleFactory();
        UnicycleFactory unicycleFactory = new UnicycleFactory();

        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Unicycle unicycle = new Unicycle();

        bicycleFactory.add(bicycle);
        tricycleFactory.add(tricycle);
        unicycleFactory.add(unicycle);
    }
}
