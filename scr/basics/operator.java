package basics;

import java.util.*;
public class operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int p = sc.nextInt();
        char o = sc.next().charAt(0);
        if(o=='+'){
            System.out.println(n+p);
        }else if(o=='-'){
            System.out.println(n-p);
        }else if(o=='*'){
            System.out.println(n*p);
        }else if(o=='/'){
            System.out.println(n/p);
        }else{
            System.out.println("Invalid");
        }
    }
}
