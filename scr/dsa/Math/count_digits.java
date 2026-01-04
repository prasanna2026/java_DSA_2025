package dsa.Math;

import java.util.*;
public class count_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }

    public static int countDigits(int n){
        if(n < 10) return 1;
        return (int)(Math.log10(n)+1);
    }
}
