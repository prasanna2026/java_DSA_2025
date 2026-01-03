package basics;

import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = Math.min(a,b);
        int ans = 1;
        for(int i=1;i<=x;i++){
            if(a%i==0 && b%i==0){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}

/*

Given two numbers a and b. The task is to find the GCD of  a and b.
The GCD of two numbers is the largest number that can divide both a and b perfectly.

Examples:

Input: a = 6, b = 9
Output: 3
Explanation: After 3 there is no number that can divide both 6 and 9 perfectly.

Input: a = 10, b = 15
Output: 5
Explanation: 5 is the greatest common divisor of 10 and 15.

*/