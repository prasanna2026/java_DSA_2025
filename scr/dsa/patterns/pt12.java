package dsa.patterns;

import java.util.*;
public class pt12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A' + i)+" ");
            }
            System.out.println();
        }
    }
}

/*

5

A
B B
C C C
D D D D
E E E E E

*/