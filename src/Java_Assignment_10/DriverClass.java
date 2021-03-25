package Java_Assignment_10;

public class DriverClass {
    public static void main(String[] args) throws Exception {
        SlistIterator slistIterator = Slist.getIterator();
        slistIterator.add(1);
        slistIterator.add(2);
        slistIterator.add(3);
        slistIterator.add(4);
        slistIterator.remove(3);
        slistIterator.add(3);
        slistIterator.add(10);
        slistIterator.add(9);
        slistIterator.remove(1);
        System.out.println("------------------ elements in list ------------------");
        while (slistIterator.hasNext()){
            System.out.print(slistIterator.next()+" ");
        }
    }
}
