package Java_Assignment_5.harsha.assignment.singleton;

public class Second {
    String variable;
    public static Second init(String variablePar){
        Second second = new Second();
        second.variable = variablePar;
        return second;
    }
    public void print(){
        System.out.println(variable);
    }
}
