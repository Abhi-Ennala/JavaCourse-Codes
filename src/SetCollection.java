import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        System.out.println("This is the HashSet");
        Set<Integer> nums= new HashSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        System.out.println(nums);

        for(int n: nums){
            System.out.println(n);
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("This is the TreeSet");
        Set<Integer> obj= new TreeSet<Integer>();
        obj.add(6);
        obj.add(5);
        obj.add(8);
        obj.add(2);
        System.out.println(nums);

//        for(int n: nums){
//            System.out.println(n);
//        }
        Iterator<Integer> val = obj.iterator();
        while(val.hasNext()){
        System.out.println(val.next());
    }
    }
}
