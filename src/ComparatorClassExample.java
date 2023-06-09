import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>{
//class Students{
    int age;
    String name;
    public Students(int age, String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return  "Student [age=" + age + ", name=" +name +"]";
    }

    public int compareTo(Students that) {
        if(this.name.length()>that.name.length())
            return 1;
        else
            return -1;
    }
}
public class ComparatorClassExample {
    public static void main(String[] args) {

        List<Students> l= new ArrayList<>();
        l.add(new Students(19,"Sanjana"));
        l.add(new Students(22,"Bhavesh"));
        l.add(new Students(21,"Abhi"));
        l.add(new Students(23,"Babloo"));

//        Comparator<Students> com= new Comparator<>(){
//            public int compare(Students i, Students j) {
//                if(i.age>j.age)
//                    return 1;
//                else
//                    return -1;
//            }
//        };
//       Collections.sort(l,com);
       Collections.sort(l);
        for(Students s: l){
            System.out.println(s);
        }

    }
}
