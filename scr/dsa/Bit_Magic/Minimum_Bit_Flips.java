package dsa.Bit_Magic;

import java.util.*;
public class Minimum_Bit_Flips {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter start number : ");
        int start = sc.nextInt();
        System.out.print("Enter goal number : ");
        int goal = sc.nextInt();
        int a = (start^goal);
        System.out.println("Minimum bit flips to reach goal : "+count_Set_bits(a));
    }

    public static int count_Set_bits(int a) {
        int cnt = 0;
        while(a>0){
            a = (a&(a-1));
            cnt++;
        }
        return cnt;
    }
}
