package basics;

import java.util.*;
public class Nth_term_of_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first term : ");
        int a = sc.nextInt();
        System.out.print("enter the difference : ");
        int d = sc.nextInt();
        System.out.print("enter the nth term to find : ");
        int n = sc.nextInt();
        int AP_ans = a+(n-1)*d;
        System.out.println(AP_ans);
    }


}
