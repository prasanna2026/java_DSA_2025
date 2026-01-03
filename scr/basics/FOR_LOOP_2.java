package basics;

import java.util.*;
public class FOR_LOOP_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i=i+2){
            System.out.print(s.charAt(i));
        }
    }
}


/*You are given a string s, you need to print its
characters at even indices (index starts at 0).

Examples:

Input: s = "Geeks"
Output: Ges
Explanation: The even indices characters are printed

.*/