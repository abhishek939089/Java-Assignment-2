// 2.Take two int values from user and print greatest among them.
import java.util.*;
public class Code_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value :");
        int n=sc.nextInt();
        System.out.println("Enter second value :");
        int m=sc.nextInt();

        if(n>m){
            System.out.println("x is greater than y ----");
        }else{
            System.out.println("y is greater than x ----");
        }
    }
}
