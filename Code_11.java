// 11.Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
import java.util.*;
public class Code_11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch=sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z')
            System.out.print(ch+ " is an UpperCase character");
     
        else if (ch >= 'a' && ch <= 'z')
            System.out.print(ch+ " is an LowerCase character" );
     
        else
            System.out.print(ch+ " is not an aplhabetic character" );
    }        
}
