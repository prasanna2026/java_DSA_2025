package dsa.Bit_Magic;

import java.util.*;
public class Check_number_is_power_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("It is power of 2 : "+checkPowerOf2(n));
    }

    public static boolean checkPowerOf2(int n){
        return ((n&(n-1))==0);

    }
}
