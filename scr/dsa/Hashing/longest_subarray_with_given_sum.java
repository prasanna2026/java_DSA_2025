package dsa.Hashing;

import java.util.*;
public class longest_subarray_with_given_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(naive(arr,sum));
        System.out.println(efficient(arr,sum));
    }

    public static int naive(int[] arr,int sum){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            int curr_sum = 0;
            for(int j=i;j<arr.length;j++){
                curr_sum += arr[j];
                if(curr_sum==sum){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }

    public static int efficient(int[] arr,int sum){
        int res = 0;
        int pre_sum = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            pre_sum += arr[i];
            if(pre_sum==sum){
                res = i+1;
            }
            if(!mp.containsKey(pre_sum)){
                mp.put(pre_sum,i);
            }
            if(mp.containsKey(pre_sum-sum)){
                res = Math.max(res,i-mp.get(pre_sum-sum));
            }
        }
        return res;
    }
}
