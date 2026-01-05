package dsa.Bit_Magic;

import java.util.*;
public class Convert_To_Binary {
    public static void main(String[] ak){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Convert2Binary(n));
    }

    public static String Convert2Binary(int n){
        if(n==0) return "0";
        StringBuilder res = new StringBuilder();

        while(n>0){
            res.append(n%2);
            n /= 2;
        }

        return res.reverse().toString();
    }
}
