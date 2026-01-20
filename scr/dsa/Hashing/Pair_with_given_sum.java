package dsa.Hashing;

import java.util.*;
public class Pair_with_given_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(findpairs(arr,sum));
    }

    public static boolean findpairs(int[] arr,int sum){
        Set<Integer>st = new HashSet<>();
        for(int x:arr){
            if(st.contains(sum-x)){
                return true;
            }else{
                st.add(x);
            }
        }
        return false;
    }
}
