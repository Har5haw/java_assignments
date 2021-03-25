package Java_Assignment_5.harsha.assignment.main;

import Java_Assignment_5.harsha.assignment.data.First;
import Java_Assignment_5.harsha.assignment.singleton.Second;

public class Main {
    public static void main(String[] args) {
        First first = new First();
        first.print();//This works as the default values get printed for int its 0, for char its ''
        first.anotherMethod();//This doesn't work as the variables are not initialized, it will give compile time error
        Second second = Second.init("hai");//This works as we are getting new object for second in init method, which is static so we can call it without any object
        second.print();//This works as it prints the variable of the objects which is created by static init method
    }
}
