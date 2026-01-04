package dsa.Math;

import java.util.*;
public class factorial_recursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(factofN(n));
    }

    public static long factofN(long n){
        if(n==0){
            return 1;
        }
        return n*factofN(n-1);
    }
}
