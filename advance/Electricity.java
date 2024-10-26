package advance;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your units consumed");
        int units= sc.nextInt();
        int bill =0;
        int discount =0;

      System.out.println("Name: "+name);
    
      System.out.println("Units Consumed :"+units);
        if(units<0)
        {
            System.out.println("Invalid");
            return;
        }
        bill= (10*units) ; 

     if(units==0 )
    { 
        discount=0;
    }
     else if(units>=1 && units<=10)
     { discount= 10;
      }
      else if (units>11 && units<=20 ){
        discount=15;
     }
     else if (units >=21 && units <=40){
        discount=30;
     }
     else{
        discount=50;
  }
  int final_bill =(100-discount)*bill/100;

  System.out.println("Discount"+ discount+"%");

  System.out.print("Your final Bill: "+final_bill);
}
}
