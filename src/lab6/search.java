package lab6;

import java.util.TreeSet;

public class search {
    public static void main(String[] args){
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Piyush");
        set1.add("Piyush");
        set1.add("Ram");
        set1.add("Pranajal");
        set1.add("Thinnk");
        System.out.println(set1);
        System.out.println(set1.contains("Piyush"));
    }
}
