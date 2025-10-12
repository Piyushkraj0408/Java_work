package lab6;

import java.util.TreeSet;

public class addAll {
    public static void main(String[] args){
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Piyush");
        set1.add("Piyush");
        set1.add("Ram");
        set1.add("Pranajal");
        set1.add("Thinnk");
        System.out.println(set1);

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("A");
        set2.add("D");
        set2.add("C");
        set2.add("U");
        System.out.println(set2);

        set1.addAll(set2);
        System.out.println("After adding all: ");
        System.out.println(set1);
    }
}
