import java.util.Collection;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        Collection<Integer> nums= new java.util.ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        System.out.println(nums);
//        for(Object n: nums){
//            System.out.println(n);
         for(int n: nums){
            System.out.println(n);
        }
        System.out.println("----------------------------------------------------------");
        List<Integer> obj= new java.util.ArrayList<>();
        obj.add(6);
        obj.add(5);
        obj.add(8);
        obj.add(2);
//        obj.get(2);
        System.out.println(obj.get(2));
        obj.set(2,3);
        System.out.println(obj.get(2));

    }
}
