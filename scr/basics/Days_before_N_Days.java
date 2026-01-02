package basics;

import java.util.*;
public class Days_before_N_Days {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("0-sunday\n1-monday\n2-tuesday\n3-wednesday\n4-thursday\n5-friday\n6-saturday");
        System.out.println();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int x = n%7;
        int ans = d-x;
        if(ans>0){
            System.out.println(ans);
        }else{
            System.out.println(ans+7);
        }
    }
}
