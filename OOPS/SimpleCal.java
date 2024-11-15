
import java.util.Scanner;

 class Add {
    Add() 
    {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        System.out.println("THe sum is "+(a+b));
    }
}
class Sub {
    Sub() 
    {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        System.out.println("THe differencew is "+(a-b));
    }
}
class Mult {
    Mult() 
    {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        System.out.println("THe product is "+(a*b));
    }
}
class Div {
    Div() 
    {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        System.out.println("THe quotient is "+(a/b));
    }
}
public class SimpleCal {
    public static void main(String[] args) {
        
        new Add();
        new Sub();
        new Mult();
        new Div(); 
    }   
}
