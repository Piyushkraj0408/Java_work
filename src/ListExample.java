import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("BOb");
        names.add("Charlie");
        System.out.println(names.get(2));
        names.add(1,"Piyush");
        System.out.println(names);
        names.remove(3);
        System.out.println(names);
        System.out.println(names.indexOf("Charlie"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        ListIterator<String> it = names.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        names.clear();
    }
}
