package basics;

import java.util.*;
public class Nth_term_of_GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first term : ");
        int a = sc.nextInt();
        System.out.print("enter the common ratio : ");
        int r = sc.nextInt();
        System.out.print("enter the Nth term to find : ");
        int n = sc.nextInt();
        int x = (int)(Math.pow(r,n-1));
        System.out.println(a * x);
    }
}
