package basics;

import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = Math.max(a,b);
        int y = a*b;
        int ans = 1;
        for(int i=x;i<=y;i++){
            if(i%a==0 && i%b==0){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}

/*

Given two numbers a and b. The task is to find out their LCM.

Examples:

Input: a = 5, b = 10
Output: 10
Explanation: LCM of 5 and 10 is 10

Input: a = 14, b = 8
Output: 56
Explanation: LCM of 14 and 8 is 56

Constraints:
1  <=  a , b  <=  103

*/