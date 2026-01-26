package dsa.Strings;

import java.util.*;
public class compress_Strings {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        String str = sc.nextLine();
        int cnt = 1;
        for(int i=1;i<=str.length();i++){
            if(i<str.length() && str.charAt(i)==str.charAt(i-1)){
                cnt++;
            }else{
                System.out.print(str.charAt(i-1));
                if(cnt > 1){
                    System.out.print(cnt);
                }
                cnt = 1;
            }
        }
    }
}
