package basics;

import java.util.*;
public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextFloat();
        double rate = 0.012;
        double usd = n*rate;
        System.out.println("$"+(int)(usd));
    }
}
