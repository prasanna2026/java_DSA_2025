package basics;

import java.util.*;
public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do{
            System.out.println("Geeksforgeeks");
            n--;
        }while(n>0);
    }
}


/*Given an integer n.
Print string "Geeksforgeeks" n times but a minimum of 1 time using a do-while loop.
Note: n can be less than 0.

Examples:

Input: 3
Output:
Geeksforgeeks
Geeksforgeeks
Geeksforgeeks
Explanation: Printed "Geeksforgeeks" 3 times.

Input: -1
Output:
Geeksforgeeks
Explanation: Printed "Geeksforgeeks" 1 times compulsory.*/