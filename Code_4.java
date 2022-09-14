// 4.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.
import java.util.*;
public class Code_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Salary of user :");
        int Salary=sc.nextInt();
        System.out.println("Enter the Experience of user[In Year] :");
        int Experience=sc.nextInt();
        int Bonus=Salary*5/100;
        int Salary_after_Bonus=Salary+Bonus;

        if(Experience>5){
            System.out.println(Salary_after_Bonus);
        }else{
            System.out.println(Salary);
        }
    }
}