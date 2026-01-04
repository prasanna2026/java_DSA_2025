package dsa.Math;

import java.util.*;
public class Trailing_zeros_in_factorial {
    public static void main(String[] sk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trailingZeros(n));
        System.out.println(NaiveSol(n));
    }

    public static int trailingZeros(int n){
        int res = 0;
        for(int i=5;i<=n;i=i*5){
            res = res + n/i;
        }
        return res;
    }

    public static int NaiveSol(int n){
        int fact = 1;
        for(int i=2;i<=n;i++){
            fact = fact * i;
        }
        int res = 0;
        while(fact%10==0){
            res++;
            fact = fact/10;
        }
        return res;
    }
}
