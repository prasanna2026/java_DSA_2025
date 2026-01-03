package basics;

import java.util.*;
public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}

/*

Given an integer n. Write a program to print all the divisors of n in a single line.

Examples:

Input: n = 12
Output: 1 2 3 4 6 12
Explanation: 12 is divisible by 1 2 3 4 6 12.

Input: n = 10
Output: 1 2 5 10
Explanation: 10 is divisible by 1 2 5 10.

Constraints:
1 <= n <= 105

*/