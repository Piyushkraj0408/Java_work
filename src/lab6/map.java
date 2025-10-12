package lab6;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args){
        Map<Integer,String>  map = new HashMap<>();
        map.put(1,"Ram");
        map.put(2,"Shyam");
        map.put(3,"RAdha");
        map.put(4,"Piyush");
        System.out.println(map.keySet().size());
    }
}
