
import java.util.Scanner;

public class Ques {
   
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
       int num= sc.nextInt();
        

        
     for(int i=1;i<=num;i++)
     {
        
        for(int j=1;j<=num;j++)
        { 
            if(i==1 ||i==num||j==1||j==num|| i==j)
            System.out.print("*");
            else
            System.out.print(" ");
        }

        
        System.out.println();

        
     }
    
       
}
}
