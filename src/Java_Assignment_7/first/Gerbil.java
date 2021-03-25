package Java_Assignment_7.first;

public class Gerbil extends Rodent{
    public Gerbil() {
        System.out.println("Gerbil constructor called");
    }

    @Override
    public String say() {
        return "I am Gerbil";
    }
}
