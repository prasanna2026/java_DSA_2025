package dsa.Strings;

import java.util.*;
public class palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        palindrome(str);
    }

    public static void palindrome(String str) {
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        if(rev.toLowerCase().equals(str.toLowerCase())){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
    }
}
