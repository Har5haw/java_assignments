package Java_Assignment_7.Fifth;

public class SecondClass{
    public class SecondInner extends FirstClass.FirstInner {
        public SecondInner(int a) {
            new FirstClass().super(a);
        }
    }
}
