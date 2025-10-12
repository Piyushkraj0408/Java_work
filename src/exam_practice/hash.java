package exam_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//frequency sorting
public class hash {
    public static void main(String[] args){
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        int j =1;
        l1.add("Ramesh");
        l1.add("Suresh");
        l1.add("Kamlesh");
        l1.add("Younish");
        l2.add("Ramesh");
        l2.add("Aunish");
        //buffer reader class
        l2.add("kamlesh");
        l2.add("Inition");
        for(String k : l1){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(String k : l2) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        System.out.println(map);
    }
}
