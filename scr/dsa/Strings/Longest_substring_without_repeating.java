package dsa.Strings;

import java.util.*;
public class Longest_substring_without_repeating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LongestSubstring(str);
    }

    public static void LongestSubstring(String str){
        int start = 0;
        int end = 0;
        int n = str.length();
        int max_len = 0;
        List<Character>list = new ArrayList<>();

        while(end<n){
            if(!list.contains(str.charAt(end))){
                list.add(str.charAt(end));
                end++;
                max_len = Math.max(max_len,list.size());
            }
            else{
                list.remove(Character.valueOf(str.charAt(start)));
                start++;

            }
        }
        System.out.println(max_len);
    }
}
