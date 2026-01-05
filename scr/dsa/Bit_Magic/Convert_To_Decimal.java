package dsa.Bit_Magic;

import java.util.*;
public class Convert_To_Decimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Convert2Decimal(s));
    }

    public static int Convert2Decimal(String s){
        int len = s.length()-1;
        char[] arr = s.toCharArray();
        int p2 = 1;
        int num = 0;
        for(int i=len;i>=0;i--){
            if(arr[i]=='1'){
                num = num + p2;
            }
            p2 = p2*2;
        }
        return num;

    }
}
