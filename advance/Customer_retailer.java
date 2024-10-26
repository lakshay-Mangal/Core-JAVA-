package advance;
import java.util.*;
public class Customer_retailer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your units purchased");
        int units= sc.nextInt();
        int discount =0;

      System.out.println("Name: "+name);
    
      System.out.println("Units purchased :"+units);
        if(units<=0)
        {
            System.out.println("Invalid");
            return;
        }

     
      if(units>=1 && units<=15)
     { discount= 15;
      }
      else if (units>16 && units<=30 ){
        discount=30;
     }
     else if (units >=31 && units <=50){
        discount=50;
     }
     else{
        System.out.println("Max 50 units allowed to retailers");
        return;
  }

  System.out.println("Discount"+ discount+"%");

}
}

