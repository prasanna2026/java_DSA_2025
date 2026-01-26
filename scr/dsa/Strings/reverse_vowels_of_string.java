package dsa.Strings;

import java.util.*;
public class reverse_vowels_of_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(swapVowels(s));
    }

    public static String swapVowels(String s){
        int i = 0;
        int j = s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j){
            if(!isVowel(arr[i])){
                i++;
            }else if(!isVowel(arr[j])){
                j--;
            }else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }

    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
            return true;
        }
        return false;
    }
}
