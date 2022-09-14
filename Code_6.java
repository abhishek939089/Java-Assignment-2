// 6.Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.*;
public class Code_6 {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of first person :");
        int age1=sc.nextInt();

        System.out.println("Enter the age of second person :");
        int age2=sc.nextInt();

        System.out.println("Enter the age of third person :");
        int age3=sc.nextInt();

        if(age1>age2 && age1>age3)

           System.out.println("First Person is the Oldest.");

       else if(age2>age1 && age2>age3)

           System.out.println("Second Person is the Oldest.");

       else if(age3>age1 && age3>age2)

           System.out.println("Third Person is the Oldest.");

       else    {

           System.out.println("All have equal ages.");

           System.exit(0);

       }

       if(age1<age2 && age1<age3)

           System.out.println("First Person is the Youngest.");

       else if(age2<age1 && age2<age3)

           System.out.println("Second Person is the Youngest.");

       else if(age3<age1 && age3<age2)

           System.out.println("Third Person is the Youngest.");
    }
}
