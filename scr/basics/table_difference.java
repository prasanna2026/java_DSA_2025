package basics;

import java.util.*;
public class table_difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1<n2){
            System.out.println("Wrong");
            return ;
        }
        for(int i=1;i<=10;i++){
            System.out.print((n1*i)-(n2*i)+" ");
        }
    }
}


/*Given two number n1 and n2, n1 > n2. Find the differences
between mathematical tables of n1 and n2 and print in a single line.
Note: Don't add a new line in the end.

Example :

Input: n1 = 9, n2 = 4
Output: 5 10 15 20 25 30 35 40 45 50
Explanation:
  9 18 27 36 45 54 63 72 81 90
- 4  8 12 16 20 24 28 32 36 40
-----------------------------------------
= 5 10 15 20 25 30 35 40 45 50*/