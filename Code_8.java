// 8.A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.
import java.util.*;
public class Code_8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of classes held :");
        int held=sc.nextInt();

        System.out.println("Enter the number of classes attended :");
        int attended=sc.nextInt();

        float attendance=(attended*100)/held;
        
        if(attendance>=75){
            System.out.println("Student allow to sit in the exam :");
        }else{
            System.out.println("Student not allow to sit in exam :");
        }
    }    
}
