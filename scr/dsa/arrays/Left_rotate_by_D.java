package dsa.arrays;

import java.util.*;
public class Left_rotate_by_D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        better(arr,n,d);
        optimized(arr,n,d);

    }

    public static void optimized(int[] arr,int n,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void better(int[] arr,int n,int d){
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i] = temp[i];
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
