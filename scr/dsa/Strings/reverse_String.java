package dsa.Strings;

import java.util.*;
public class reverse_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(char c:arr){
            System.out.print(c);
        }
    }
}
