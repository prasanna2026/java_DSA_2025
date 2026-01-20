package dsa.arrays;

import java.util.*;
public class Count_Distinct_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x = countDistinct(arr);
        System.out.println(x);
    }
    public static int countDistinct(int[] arr){
        int n = arr.length;
        boolean isDistinct = true;
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=(i-1);j>=0;j--){
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
                cnt++;
            }
        }
        return cnt;
    }
}
