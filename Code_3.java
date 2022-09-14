// 3.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.
import java.util.*;
public class Code_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quantity :");
        int q=sc.nextInt();
        int cost=q*100;
        int discount=cost*10/100;
        int after_discount=cost-discount;

        if(cost>1000){
            System.out.println("Cost of the product: "+after_discount);
        }
    }
}
