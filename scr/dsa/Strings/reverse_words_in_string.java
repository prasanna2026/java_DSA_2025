package dsa.Strings;

import java.util.*;
public class reverse_words_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String str) {
        str = str.trim();
        String[] words = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
