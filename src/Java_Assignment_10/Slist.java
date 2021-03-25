package Java_Assignment_10;

public class Slist {
    Slist next;
    int data;

    public static SlistIterator getIterator(){
        return new SlistIterator();
    }
}
