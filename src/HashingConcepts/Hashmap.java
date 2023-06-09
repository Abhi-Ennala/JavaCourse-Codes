package HashingConcepts;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("China",150);
        map.put("US",80);


//        System.out.println(map);
        //You can update the value of a Key
        map.put("China",180);
        System.out.println(map);

        //Search
        if(map.containsKey("China")){
            System.out.println("key is present");
        }
        System.out.println(map.get("China"));// Returns the value
        System.out.println(map.get("Japan"));// Returns null if Key is not present


        //Iterate
        for(Map.Entry<String,Integer> e: map.entrySet()){

            System.out.println(e.getKey()+":"+e.getValue());
        }

        //To access all keys
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key);
        }

        //To remove a pair
        map.remove("China");

    }
}
