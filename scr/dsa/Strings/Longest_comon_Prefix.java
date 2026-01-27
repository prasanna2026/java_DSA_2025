package dsa.Strings;

import java.util.*;
public class Longest_comon_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        for(int i=0;i<n;i++){
            strs[i] = sc.nextLine();
        }
        System.out.println(longprefix(strs));
    }

    public static String longprefix(String[] strs){

        if(strs==null||strs.length==0) return "";

        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int index = 0;
        while(index<str1.length() && index<str2.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        if(index!=0) {
            return str1.substring(0,index);
        }
        return "";
    }
}
