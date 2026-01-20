package dsa.Bit_Magic;

import java.util.*;
public class Count_the_set_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(n>0){
            n = n&(n-1); 
            cnt++;
        }
        System.out.print("Number of set bits : "+cnt);
    }
}
