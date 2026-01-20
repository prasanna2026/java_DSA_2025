package dsa.arrays;

import java.util.*;
public class left_rotate_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n - 1] = temp;

        for(int x:arr){
            System.out.print(x + " ");
        }
    }
}
