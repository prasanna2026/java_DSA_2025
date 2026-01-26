package dsa.Strings;

import java.util.*;
public class Anagrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(anagrams(s1,s2));

    }

    public static boolean anagrams(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            return true;
        }
        return false;
    }
}
