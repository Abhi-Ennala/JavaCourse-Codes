package HashingConcepts;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //add elements
        set.add(1);
        set.add(2);
        set.add(3);

//        //search
//        boolean con =set.contains(1);
//        if(set.contains(1)){
//            System.out.println("contains 1");
//        }
//
//        //Delete
//        set.remove(1);
//
//        //Size of set
//        set.size();
//
//        //To print all elements
//        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
