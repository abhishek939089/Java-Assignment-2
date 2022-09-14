// 3.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
// INPUT : 1234        OUTPUT : 4321
// INPUT : 5982        OUTPUT : 2895
import java.util.*;
public class Code_14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        while(num>0){
            int lastdigit = num%10;
            System.out.print(lastdigit);
            num = num /10;
        }
        System.out.println();
    }
}