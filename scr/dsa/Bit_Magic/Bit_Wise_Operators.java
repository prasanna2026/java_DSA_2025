package dsa.Bit_Magic;

import java.util.*;
public class Bit_Wise_Operators {
    public static void main(String[] ak){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        AND(n,m);
        OR(n,m);
        XOR(n,m);
        LEFT_SHIFT(n);
        RIGHT_SHIFT(n);
        NOT(m);
    }

    public static void AND(int n,int m){
        System.out.println("AND operator : "+(n&m));      //& ---> 1 if both the bits are 1
    }

    public static void OR(int n,int m){
        System.out.println("OR operator : "+(n|m));      // | ---> 1 if any bit is 1
    }

    public static void XOR(int n,int m){
        System.out.println("XOR operator : "+(n^m));    // ^ ---> 1 if bits are different
    }

    public static void LEFT_SHIFT(int n){
        System.out.println("Left Shift operator : "+(n<<3));  // << ---> shift bits left (2*x)
    }

    public static void RIGHT_SHIFT(int n){
        System.out.println("Right Shift operator : "+(n>>3));  // >> ---> shift bits to right (x/2);
    }

    public static void NOT(int n){
        System.out.println("Not operator : "+(~n));
    }
}

/*

OR (|) → set bit

XOR (^) → toggle bit

AND with NOT → clear bit

*/


/*
Quick Bit Magic Summary (VERY IMPORTANT)

Operation	      Operator

Set i-th bit	     `n
Clear i-th bit	   n & ~(1 << i)
Toggle i-th bit	   n ^ (1 << i)
Check i-th bit	   (n & (1 << i)) != 0

*/