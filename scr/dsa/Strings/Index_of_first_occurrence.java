package dsa.Strings;

import java.util.*;
public class Index_of_first_occurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String haystack = sc.next();
        String needle = sc.next();
        System.out.println(indexOffirstOccurence(haystack,needle));
    }

    public static int indexOffirstOccurence(String haystack,String needle){
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
