package dsa.Hashing;

import java.util.*;
public class hashset {
    public static void main(String[] args){

        HashSet<String> hs = new HashSet<>();
        hs.add("gfg");
        hs.add("hello");
        hs.add("world");

        System.out.println(hs);

        System.out.println(hs.contains("world"));

        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        hs.remove("gfg");

        System.out.println(hs.size());

        System.out.println(hs.isEmpty());
    }
}
