import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.addLast("B");
        list.addFirst("C");
        list.offer("D");
        list.offerFirst("E");
        list.offerLast("F");
        System.out.println(list);
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            it.next();
        }
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
