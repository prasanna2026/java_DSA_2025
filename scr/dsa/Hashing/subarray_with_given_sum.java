package dsa.Hashing;

import java.util.*;
public class subarray_with_given_sum {
    public static void main(String[] args) {
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

    public static boolean naive(int[] arr,int sum){
        int curr_sum;
        for(int i=0;i<arr.length;i++){
            curr_sum = 0;
            for(int j=i;j<arr.length;j++){
                curr_sum += arr[j];
                if(curr_sum == sum){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean efficient(int[] arr,int sum){
        int prefix_sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int x:arr){
            prefix_sum += x;

            if(prefix_sum == sum) return true;

            if(set.contains(prefix_sum-sum)) return true;

            set.add(prefix_sum-sum);
        }
        return false;
    }
}
