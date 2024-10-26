import java.util.Scanner;

public class Tax_calculator {
    public static void main(String[] args) {
        System.out.println("Enter your income");
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        if(income<=10000)
        income=income;
        else if(income>10000)
        {
            income = (9*income)/10;
        }  
       else  if(income>30000)
        {
            income = (8*income)/10;
        }   
       else if(income>50000)
        {
            income = (7*income)/10;
        }
    else{
        System.out.println("Please check your income");
    }         

    System.out.println("Final income after taxes is " +income);


    }    
}
