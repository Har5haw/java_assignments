package Java_Assignment_7.Fourth.Factories;

import Java_Assignment_7.Fourth.Models.Tricycle;

import java.util.ArrayList;

public class TricycleFactory {
    ArrayList<Tricycle> tricycleArrayList;
    public TricycleFactory(){
        this.tricycleArrayList = new ArrayList<>();
    }

    public void add(Tricycle tricycle){
        this.tricycleArrayList.add(tricycle);
    }
}
