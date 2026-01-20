package dsa.arrays;

import java.util.*;
public class move_zeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        moveZeros(arr);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    static void moveZeros(int[] arr){
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,cnt);
                cnt++;
            }
        }
    }

    static void swap(int[] arr,int i,int cnt){
        int temp = arr[i];
        arr[i] = arr[cnt];
        arr[cnt] = temp;
    }
}
