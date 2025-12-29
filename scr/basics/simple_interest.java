package basics;

import java.util.*;
public class simple_interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int result = (p*r*t)/100;
        System.out.println("Simple interest : "+result);
    }
}
