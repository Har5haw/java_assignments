package Java_Assignment_7.first;

public class Mouse extends Rodent{
    public Mouse() {
        System.out.println("Mouse constructor called");
    }

    @Override
    public String say() {
        return "I am mouse";
    }
}
