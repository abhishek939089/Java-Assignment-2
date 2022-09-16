// 2.Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
// if employee is female, then she will work only in urban areas.

// if employee is a male and age is in between 20 to 40 then he may work in anywhere

// if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

// And any other input of age should print "ERROR".
import java.util.*;
public class Code_13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age :");
        int age=sc.nextInt();
        System.out.println("Enter the sex(M & F) :");
        String sex=sc.next();
        System.out.println("Enter the marital status(Y or N) :");
        String marital_status=sc.next();
        if((sex).compareTo("F")==0){
            System.out.println("She will work in urban areas :");
        }else{
            if(age>=20 && age<=40){
                System.err.println("Employee can work anywhere :");
            }else if(age>=40 && age<=60){
                System.out.println("Employee can work only in urban areas :");
            }else{
                System.out.println("Plese input valid age :");
            }
        }
    }
}
