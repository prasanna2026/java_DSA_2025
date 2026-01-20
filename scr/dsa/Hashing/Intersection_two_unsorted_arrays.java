package dsa.Hashing;

import java.util.*;
public class Intersection_two_unsorted_arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        Set<Integer> st = new HashSet<>();
        for(int x:arr2){
            st.add(x);
        }

        Set<Integer> result = new HashSet<>();
        for(int i=0;i<n;i++){
            if(st.contains(arr1[i])){
                result.add(arr1[i]);
            }
        }

        for(int x:result){
            System.out.print(x+" ");
        }



    }
}
