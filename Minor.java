

import java.util.Scanner;


class Addition{
    void add(int x , int y)
    {
        
        System.out.println("The sum is "+ (x+y));


    }
}
class Subtraction{
    void sub(int x , int y)
    {
     
        System.out.println("The difference is "+ (x-y));
    }


}
class Product{
    void mult(int x ,int y)
    {
        
        System.out.println("The product is "+ (x*y));
    }


}
class Quotient{
    void quot(int x, int y) {
       
        System.out.println("The quotient is "+ (x/y));
    }
}
class Remainder{


    void rem(int x ,int y) {
       
        System.out.println("The remainder is "+ (x%y));
    }
}
public class Minor{
   
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        Addition a1 = new Addition();
    Subtraction s1 = new Subtraction();
    Product p1= new Product();
    Quotient q1 =new Quotient();
    Remainder r1=new Remainder();
        a1.add(x,y);
        s1.sub(x,y);
        p1.mult(x,y);
        q1.quot(x,y);
        r1.rem(x,y);
    }


}
