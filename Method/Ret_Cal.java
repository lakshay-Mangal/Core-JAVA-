
import java.util.Scanner;

class Calculator{
    int add(int a , int b) {
        
        return a+b;
    }

    int sub(int a, int b) {
 
    return a-b;

}


    int prod(int a ,int b) {

    return a*b;
}


    int quot(int a ,int b) {
       
    return a/b;
    }

    int rem(int a ,int b) {
      
    return a%b;
    }
}


public class Ret_Cal {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operation");
        String op = sc.nextLine();
        Calculator cal = new Calculator();
        op=op.toLowerCase();
        switch(op) {

      
     case "sum" ->  System.out.println("The sum is "+ cal.add(a, b)); 
      case "difference" ->  System.out.println("The difference is "+ cal.sub(a, b)); 
       case "product" -> System.out.println("The product is "+ cal.prod(a, b)); 
      case "quotient"-> System.out.println("The quotient is "+ cal.quot(a, b)); 
       case "remainder" ->System.out.println("The remainder is "+ cal.rem(a, b)); 
        }

    }
    
}
