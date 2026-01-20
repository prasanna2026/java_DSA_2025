package dsa.Hashing;

import java.util.*;
public class hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("hello",1);
        hm.put("vanakam",2);
        hm.put("good morning",3);
        System.out.println(hm);
        System.out.println(hm.size());
        for(Map.Entry<String,Integer>e : hm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        if(hm.containsKey("vanakam")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        if(hm.containsKey("Good morning")){
            hm.remove("Good morning");
        }

        System.out.println(hm.get("vanakam"));
    }
}
