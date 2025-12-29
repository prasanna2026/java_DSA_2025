package basics;

import java.util.*;
public class palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("\\s+","");
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start]!=arr[end]) {
                System.out.println("Not a Palindrome");
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
    }
}
