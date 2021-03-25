package Java_Assignment_10;

public class SlistIterator {

    Slist slist;
    Slist current_pos;

    public void add(int data){
        if(slist == null){
            Slist newElement = new Slist();
            newElement.data = data;
            slist = newElement;
        }else{
            Slist element = slist;
            while (element.next != null){
                element = element.next;
            }
            Slist newElement = new Slist();
            newElement.data = data;
            element.next = newElement;
        }
    }

    public void remove(int data) throws Exception {
        if(slist.next == null){
            throw new Exception("linked list is empty");
        }
        Slist element = slist;
        Slist previous = slist;
        while (element != null && element.data != data){
            previous = element;
            element = element.next;
        }
        if (element != null){
            previous.next = element.next;
        }
    }

    public boolean hasNext(){
        if (current_pos == null){
            current_pos = new Slist();
            current_pos.next = slist;
        }
        if(current_pos.next == null){
            return false;
        }else{
            return true;
        }
    }

    public int next(){
        if (current_pos == null){
            current_pos = new Slist();
            current_pos.next = slist;
        }
        current_pos = current_pos.next;
        return current_pos.data;
    }
}
