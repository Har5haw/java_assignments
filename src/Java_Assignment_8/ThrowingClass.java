package Java_Assignment_8;

public class ThrowingClass {
    public void pleaseThrowOne() throws ExceptionOne {
        throw new ExceptionOne();
    }
    public void pleaseThrowTwo() throws ExceptionTwo {
        throw new ExceptionTwo();
    }
    public void pleaseThrowThree() throws ExceptionThree {
        throw new ExceptionThree();
    }
    public void pleaseThrowAll() throws ExceptionOne, ExceptionTwo, ExceptionThree {
        pleaseThrowOne();
        pleaseThrowTwo();
        pleaseThrowThree();
    }
}
