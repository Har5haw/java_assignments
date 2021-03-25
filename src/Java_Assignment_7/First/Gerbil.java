package Java_Assignment_7.First;

public class Gerbil extends Rodent{
    public Gerbil() {
        System.out.println("Gerbil constructor called");
    }

    @Override
    public String say() {
        return "I am Gerbil";
    }
}
