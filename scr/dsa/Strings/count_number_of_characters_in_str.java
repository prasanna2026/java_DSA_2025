package dsa.Strings;

import java.util.*;
public class count_number_of_characters_in_str {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }else{
               cnt++;
            }
        }
        System.out.println(cnt);
    }
}
