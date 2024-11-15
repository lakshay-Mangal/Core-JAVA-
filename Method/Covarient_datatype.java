
import java.util.Scanner;

class Addition{
    Addition add(int a ,int b) {
        
        System.out.println("The sum is "+(a+b));
        return this;
    }
}  
class Subtraction {
    Subtraction sub(int a, int b) {
   
    System.out.println("The difference is "+(a-b));
    return this;

}
}
class Product {
    Product prod(int a ,int b ) {
   
    System.out.println("The product is "+(a*b));
    return this;
}
}

class Divide {
    Divide quot(int a , int b) {
    
    System.out.println("The quotient is "+(a/b));
    return this;
    }
}
class Remainder{
    Remainder rem(int a, int b) {
      
    System.out.println("The remainder is "+(a%b));
    return this;
    }
}


public class Covarient_datatype {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        Addition a1 = new Addition();
        a1.add(a,b);
        Subtraction s1 = new Subtraction();
        s1.sub(a,b);
        Product p1 = new Product();
        p1.prod(a,b);
        Divide d1 = new Divide();
        d1.quot(a,b);
        Remainder r1= new Remainder();
        r1.rem(a,b);

    }
    
}
