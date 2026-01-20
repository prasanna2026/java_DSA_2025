package dsa.Hashing;

import java.util.*;
public class union_two_unsorted_array {
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
        for(int x:arr1){
            st.add(x);
        }
        for(int x:arr2){
            st.add(x);
        }

        System.out.println(st.size());
    }
}
