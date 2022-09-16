// 1.Write a program to check if a year is leap year or not.
// If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.
import java.util.*;
public class Code_12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year :");
        int year=sc.nextInt();

        // if the year is divided by 4
    if (year % 4 == 0) {

        // if the year is century
        if (year % 100 == 0) {
  
          // if year is divided by 400
          // then it is a leap year
            if (year % 400 == 0)
                System.out.println("Leap year :");            
            else
                System.out.println("Not leap year :");
        }
        
        // if the year is not century
        else
            System.out.println("Leap year :");
        }
      
        else
            System.out.println("Not leap year :");
    }
}
// Or-------------------------->>>>>>>>>>>>>>>>>>>>>>>>>
// public class Main{
//     public static void main (String[]args)
//     {
 
//       int year = 2020;
 
//       if (year % 400 == 0)
//         System.out.println (year + " is a Leap Year");
 
//       else if (year % 4 == 0 && year % 100 != 0)
//         System.out.println (year + " is a Leap Year");
 
//       else
//           System.out.println (year + " is not a Leap Year");
 
//     }
//   }