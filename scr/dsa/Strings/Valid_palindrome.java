package dsa.Strings;

import java.util.*;
public class Valid_palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        System.out.println(ValidPalin(str));
    }

    public static boolean ValidPalin(String str){
        String rev = "";
        char[]arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(isalphaNumberic(arr[i])){
                rev = rev + arr[i];
            }
        }
        System.out.println(rev);
        return checkpalindrome(rev);
    }

    public static boolean checkpalindrome(String rev){
        rev = rev.toLowerCase();
        int i=0;
        int j=rev.length()-1;
        while(i<j){
            if(rev.charAt(i)!=rev.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isalphaNumberic(char ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }
}
