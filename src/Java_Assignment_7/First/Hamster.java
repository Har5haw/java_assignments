package Java_Assignment_7.First;

public class Hamster extends Rodent{
    public Hamster() {
        System.out.println("Hamster constructor called");
    }

    @Override
    public String say() {
        return "I am Hamster";
    }
}
