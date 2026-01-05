package dsa.Bit_Magic;

import java.util.*;
public class Remove_last_Set_Bit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int ans = remove_last_set_bit(n);
        System.out.print("After removing the last set bit : "+ans);
    }

    public static int remove_last_set_bit(int n){
        return (n&(n-1));
    }
}
