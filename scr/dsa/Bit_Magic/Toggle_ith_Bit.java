package dsa.Bit_Magic;

import java.util.*;
public class Toggle_ith_Bit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.print("Enter i : ");
        int i = sc.nextInt();
        int ans = toggle_ith_bit(n,i);
        System.out.println("after toggle ith bit : "+ans);
    }

    public static int toggle_ith_bit(int n,int i){
        return (n^1<<i);
    }
}
