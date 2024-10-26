package  Super;

import java.util.Scanner;

public class Ticket_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of tickets");
        int num = sc.nextInt();
        if(num<5 || num>40){
        System.out.println("Invalid number of tickets");
        return ;
    }       
    int ticket_cost=0;
        System.out.println("Enter ticket type now (k or q )");
        char ticket_type = sc.next().charAt(0);
        switch (ticket_type) {
            case 'k' -> ticket_cost = 75;
            case 'q' -> ticket_cost =150;
            default -> System.out.println("Invalid ticket type");
        }
        
         System.out.println("Do you have coupon (y or n)");
         char coupon = sc.next().charAt(0);

         System.out.println("Do you want refreshments");
         char refresh = sc.next().charAt(0);

         double total_cost ;
         double final_cost = 0;

         total_cost = ticket_cost*num;
         if(num>20)
         {
            total_cost = total_cost* 0.9;
 
         }
         if(coupon == 'y')
         {
            total_cost= total_cost* 0.98;
         }
         final_cost = total_cost;

         if(refresh =='y')
         {
            int refresh_cost = num*50;
            final_cost= total_cost+ refresh_cost;
         }
        
         System.out.println("The final cost is " + final_cost);

    }
}
