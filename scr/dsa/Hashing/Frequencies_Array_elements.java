package dsa.Hashing;

import java.util.*;
public class Frequencies_Array_elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        LinkedHashMap<Integer,Integer>mp = new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer>e:mp.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }



    }
}
