// 7.Write a program to print absolute value of a number entered by user. E.g.-
// INPUT: 1        OUTPUT: 1
// INPUT: -1        OUTPUT: 1
import java.util.*;
public class Code_7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        int value=sc.nextInt();
        if(value<0){
            value=value*-1;
            System.out.println("Absolute value is :"+value);
        }else{
            System.out.println("Absolute value is :"+value);
        }
    }
}
