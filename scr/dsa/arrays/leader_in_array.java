package dsa.arrays;

import java.util.*;
public class leader_in_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        naive(arr,n);
        optimized(arr,n);
    }

    public static void naive(int[] arr,int n){
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag==false) System.out.print(arr[i]+" ");
        }
    }

    public static void optimized(int[] arr,int n){
        int current_leader = arr[n-1];
        System.out.print(current_leader+" ");
        for(int i=n-1;i>=0;i--){
            if(current_leader<arr[i]){
                current_leader = arr[i];
                System.out.print(current_leader+" ");
            }
        }
    }
}
