package dsa.Strings;

import java.util.*;
public class Length_of_last_word {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        int cnt = 0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                cnt++;
            }else{
                break;
            }
        }
        System.out.println("Last word length : "+cnt);

    }
}
