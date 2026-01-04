package dsa.Math;

import java.util.*;
public class Print_Divisors {
    public static void main(String[] sk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDivisors(n);
    }

    public static void printDivisors(int n){
        int i;
        for(i=1;i*i<n;i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        i--;
        for(;i>=1;i--){
            if(n%i==0){
                System.out.print((n/i)+" ");
            }
        }
    }
}
