
import java.util.Scanner;

 class Add {
    Add(int a , int b) 
    {
       
        System.out.println("THe sum is "+(a+b));
    }
}
class Sub {
    Sub(int a , int b) 
    {
      
        System.out.println("THe differencew is "+(a-b));
    }
}
class Mult {
    Mult(int a, int b) 
    {
    
        System.out.println("THe product is "+(a*b));
    }
}
class Div {
    Div(int a, int b) 
    {
     
        System.out.println("THe quotient is "+(a/b));
    }
}
public class ParaCal {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        
        new Add(a,b);
        new Sub(a,b);
        new Mult(a,b);
        new Div(a,b); 
    }   
}
