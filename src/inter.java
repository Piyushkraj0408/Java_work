import java.util.*;
public class inter {
    public static void main(String[] args){
        Collection<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("orange");
        System.out.println(fruit);
        System.out.println(fruit.size());
        System.out.println(fruit.contains("banana"));
        fruit.remove("apple");
        System.out.println(fruit);
        System.out.println(fruit.isEmpty());
        Iterator<String> it = fruit.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println();
        Object[] array = fruit.toArray();
        System.out.println(Arrays.toString(array));
        fruit.clear();
        System.out.println(fruit);
        System.out.println(fruit.isEmpty());
    }
}
