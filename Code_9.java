// 9.Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
import java.util.*;
public class Code_9 {
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
            System.out.println("Do you have medical cause :");
            String medical=sc.next();

            if((medical).compareTo("Yes")==0){
                System.out.println("Student allow to sit in the exam :");
            }else{
                System.out.println("Student not allow to sit in the exam :");
            }
        }
    }    
}
