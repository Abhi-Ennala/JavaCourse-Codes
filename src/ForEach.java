import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2,35,4,6,74,24);

//        Consumer<Integer> con = new Consumer<>(){
//            public void accept(Integer n){
//                System.out.println(n);
//            }
//        };
//        Consumer<Integer> con = n->System.out.println(n);

//        l.forEach(con);

l.forEach(n-> System.out.println(n));
//        for(Integer n: l){
//            System.out.println(n);
//        }
    }
}
