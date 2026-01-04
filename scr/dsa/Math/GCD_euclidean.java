package dsa.Math;

import java.util.*;
public class GCD_euclidean {
    public static void main(String[] sk){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
        System.out.println(Naivesol(a,b));
    }

    public static int GCD(int a,int b){
        if(b==0){
            return a;
        }else{
            return GCD(b,a%b);
        }
    }

    public static int Naivesol(int a,int b){
        int x = Math.min(a,b);
        int ans = 1;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                ans = i;
            }
        }
        return ans;
    }
}
