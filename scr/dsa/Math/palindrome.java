package dsa.Math;

import java.util.*;
public class palindrome {
    public static void main(String[] sk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;
        while(temp!=0){
            int t = temp%10;
            rev = rev*10 + t;
            temp = temp/10;
        }
        return rev == n;
    }
}
