package Java_Assignment_10;

public class Slist {
    Slist next;
    int data;

    public SlistIterator getIterator(){
        return new SlistIterator();
    }
}
