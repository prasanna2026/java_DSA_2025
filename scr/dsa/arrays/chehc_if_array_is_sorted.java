package dsa.arrays;

import java.util.*;
public class chehc_if_array_is_sorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(checkItSorted(a));
    }

    public static boolean checkItSorted(int[] a){
        if(a.length == 0) return false;
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]){
                return false;
            }

        }
        return true;
    }
}
