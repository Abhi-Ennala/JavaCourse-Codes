import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Abhi",96);
        students.put("Neeraj",97);
        students.put("Babloo",95);
        students.put("Abhi",98);//we can change the value but key is unique and cannot be changed
//        System.out.println(students.keySet());
        for(String key: students.keySet()){
            System.out.println(key+":"+students.get(key));
        }
    }

}
