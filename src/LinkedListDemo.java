import java.util.LinkedList;

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
        //Java DOC
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);

        list.push("X");
        list.push("Y");
        System.out.println(list.pop());

    }
}
