package Java_Assignment_8;


public class Assignment {
    public static void main(String[] args) {
        ThrowingClass throwingClass = new ThrowingClass();
        try{
            throwingClass.pleaseThrowAll();
        }catch (ExceptionOne | ExceptionTwo | ExceptionThree exception){
            exception.printStackTrace();
        }finally {
            System.out.println("This is finally");
        }
    }
}
