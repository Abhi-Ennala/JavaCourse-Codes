import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2,35,4,6,74,24);
//        Stream<Integer> s1= l.stream();
//        Stream<Integer> s2= s1.filter(n->n%2==0);// You cannot reuse a stream, once it's used it retires
//        Stream<Integer> s3= s2.map(n->n*2);
        int result=l.stream()
                    .filter(n->n%2==0)//Filters all the elements using predicate value, either true or false...... on stream() we are applying filter, we will get a new stream
                    .map(n->n*2)//applies a certain function to the stream ........on the new stream map method is applied
                    .reduce(0,(c,e)->c+e);//the method basically reduces a number like adding four number.Here 0 is the initial value, c is carry and e is element
        System.out.println(result);
//        l.forEach(n-> System.out.println(n));
    }
}

