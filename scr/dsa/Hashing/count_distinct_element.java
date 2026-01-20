package dsa.Hashing;

import java.util.*;
public class count_distinct_element {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hm.size());

    }
}
