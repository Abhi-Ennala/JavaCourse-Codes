import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(44);
        l.add(67);
        l.add(56);
        l.add(59);
        Comparator<Integer> com = (i,j) ->{
                if(i%10>j%10)
                    return 1;
                else
                    return -1;
            };



        Collections.sort(l,com);
        System.out.println(l);
    }
}
