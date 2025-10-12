package lab6;

import java.util.LinkedHashSet;

public class addlastinLinkedhs {
    public static void main(String[] args){
        LinkedHashSet<String> l = new LinkedHashSet<>();
        l.add("Ram");
        l.add("Pranav");
        l.add("Prajjwal");
        System.out.println("Before adding : " + l);
        l.addLast("Again");
        System.out.println("after adding : "+ l);
    }
}
