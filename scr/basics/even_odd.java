package basics;
import java.util.*;


public class even_odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
}
