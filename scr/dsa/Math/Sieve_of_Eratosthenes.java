package dsa.Math;

import java.util.*;
public class Sieve_of_Eratosthenes {
    public static void main(String[] sk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j = j+i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
