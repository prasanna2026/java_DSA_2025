package dsa.patterns;

import java.util.*;
public class pt7 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int stars = 0;
        for(int i=1;i<=2*n-1;i++){
            stars = i;
            if(stars > 5) stars = 2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*

 5
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*


*/