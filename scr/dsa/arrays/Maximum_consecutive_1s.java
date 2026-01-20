package dsa.arrays;

import java.util.*;

public class Maximum_consecutive_1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res = 0;
        int current = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                current = 0;
            }else{
                current++;
                res = Math.max(res,current);
            }
        }
        System.out.println(res);
    }
}
