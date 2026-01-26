package dsa.Strings;

import java.util.*;
public class First_unique_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(nonrepeating(str));
    }

    public static int nonrepeating(String str){
        int[] freq = new int[26];
        char[] arr = str.toCharArray();
        for(char c:arr){
            freq[c-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(freq[arr[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
