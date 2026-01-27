package dsa.Strings;

import java.util.*;
public class word_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String pattern = sc.nextLine();
        System.out.print(wordpattern(pattern,s));
    }

    public static boolean wordpattern(String pattern,String s){
        String[] arr = s.split(" +");
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> hm = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            boolean containsKey = hm.containsKey(ch);
            if(hm.containsValue(arr[i]) && !containsKey){
                return false;
            }
            if(containsKey && !hm.get(ch).equals(arr[i])){
                return false;
            }
            else{
                hm.put(ch,arr[i]);
            }

        }
        return true;
    }
}
