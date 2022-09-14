// 1.Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.*;
public class Code_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int l=sc.nextInt();
        System.out.println("Enter the breadth:");
        int b=sc.nextInt();

        if(l==0 | b==0){
            System.out.println("Not Square ");
        }else if(l==b){
            System.out.println("Square");
        }else{
            System.out.println("Not Square");
        }
    }
}