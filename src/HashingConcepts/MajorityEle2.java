package HashingConcepts;

import java.util.HashMap;

public class MajorityEle2 {
    public static void Majority(int []a){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=a.length;
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        for(int key: map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }

        }
    }
    public static void main(String[] args) {
        int[] a = {1,2};
       Majority(a);
    }
}
