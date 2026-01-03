package basics;

import java.util.*;
public class Count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(n>0){
            n = n/10;
            cnt++;
        }
        System.out.println(cnt);
    }
}


/*Given a natural number n. You have to find the number of digits in it and return it.

Examples:

Input: n = 5534
Output: 4
Explanation: 5534 has 4 digits

Input: n = 100273
Output: 6
Explanation: 100273 has 6 digits*/