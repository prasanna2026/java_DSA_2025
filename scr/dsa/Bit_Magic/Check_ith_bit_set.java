package dsa.Bit_Magic;

import java.util.*;
public class Check_ith_bit_set {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        boolean ans = check_ith_bit(n,i);
        System.out.println(ans);
    }

    static boolean check_ith_bit(int n,int i)
    {
        int ans = (1<<i)&n;
        if(n==0)  return false;
        return ans != 0;

    }
}
