package dsa.Math;

import java.util.*;
public class check_for_prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Naive method : "+brute(n));
        System.out.println("Better method : "+better(n));
        System.out.println("Optimized method : "+optimized(n));
    }

    public static boolean brute(int n){
        if(n==1 || n==0) return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean better(int n){
        if(n==0 || n==1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static boolean optimized(int n){
        if(n==1 || n==0) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
