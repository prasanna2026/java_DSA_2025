package dsa.Hashing;

import java.util.*;
public class subarray_with_zero_sum {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(subarray0sum(arr,n));
        System.out.println(efficient(arr,n));
    }

    public static boolean subarray0sum(int[] arr,int n){
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum = sum + arr[j];
                if(sum==0){
                    return true;
                }
            }
        }
        return false;
    }

    public static  boolean efficient(int[] arr,int n){
        HashSet<Integer> st = new HashSet<>();
        int pre_sum = 0;
        for(int i=0;i<n;i++){
            pre_sum = pre_sum + arr[i];
            if(st.contains(pre_sum)){
                return true;
            }
            if(pre_sum==0){
                return true;
            }
            st.add(pre_sum);
        }
        return false;
    }
}
