package dsa.Bit_Magic;

import java.util.*;
public class Swap_2_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Swap2Numbers(a,b);
    }

    public static void Swap2Numbers(int a,int b){
        System.out.println("Before "+a+" "+b);
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("After : "+a+" "+b);
    }
}
