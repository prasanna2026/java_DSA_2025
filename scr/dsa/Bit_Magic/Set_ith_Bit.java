package dsa.Bit_Magic;

import java.util.*;
public class Set_ith_Bit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter i : ");
        int i = sc.nextInt();
        int ans = set_ith_bit(n,i);
        System.out.println("After setting ith bit : "+ans);
    }

    public static int set_ith_bit(int n,int i){
        return ((1<<i)|n);
    }
}
