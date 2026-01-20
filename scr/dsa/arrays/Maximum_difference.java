package dsa.arrays;

//Maximum value of arr[j] - arr[i] such that j>i

import java.util.*;
public class Maximum_difference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findMaxiDiff(arr,n);
    }

    public static void findMaxiDiff(int[] arr,int n){
       int res = arr[1]-arr[0];
       int minval = arr[0];
       for(int j=1;j<n;j++){
           res = Math.max(res,arr[j]-minval);
           minval = Math.min(minval,arr[j]);
       }

       System.out.println(res);
    }
}
