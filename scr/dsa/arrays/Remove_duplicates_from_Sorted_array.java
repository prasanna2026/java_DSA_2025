package dsa.arrays;

import java.util.*;
public class Remove_duplicates_from_Sorted_array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x = removeDup(arr);
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDup(int[] arr){
        int n = arr.length;
        int res = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
