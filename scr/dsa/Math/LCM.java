package dsa.Math;

import java.util.*;
public class LCM {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Naive Solution : "+NaiveSol(a,b));
        System.out.println("Efficient solution : "+lcm(a,b));
    }

    public static int NaiveSol(int a,int b){
        int x = Math.max(a,b);
        int y = a*b;
        int ans = 0;
        for(int i=x;i<=y;i++){
            if(i%a==0 && i%b==0){
                ans = i;
                break;
            }
        }
        if(ans==0){
            ans = a*b;
        }
        return ans;
    }

    //optimized
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }

    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}
