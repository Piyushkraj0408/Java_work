package lab6;

import java.util.ArrayList;

public class insertFirstList {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Piyush");
        list.add("Ram");
        list.add("Sam");
        list.addFirst("Charlie");
        System.out.println(list);

    }
}
