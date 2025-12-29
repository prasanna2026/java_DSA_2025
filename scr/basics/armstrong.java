package basics;

import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =  sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(isArmstrong(i)){
                System.out.println(i+" ");
            }
        }
    }

    public static boolean isArmstrong(int n){
        int temp = n;
        int count = String.valueOf(n).length();
        int sum = 0;

        while(n>0){
            int digit = n%10;
            sum = (int)((int)sum + Math.pow(digit,count));
            n = n/10;
        }

        return sum == temp;
    }
}
