package Java_Assignment_7.Fourth.Factories;

import Java_Assignment_7.Fourth.Models.Unicycle;

import java.util.ArrayList;

public class UnicycleFactory {
    ArrayList<Unicycle> unicycleArrayList;
    public UnicycleFactory(){
        this.unicycleArrayList = new ArrayList<>();
    }

    public void add(Unicycle unicycle){
        this.unicycleArrayList.add(unicycle);
    }
}
