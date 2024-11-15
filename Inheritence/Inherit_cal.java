
import java.util.Scanner;

class Calculator {
    private int a, b;
    void setNum(int a, int b) {
        this.a=a;
        this.b=b;
    }
    int getA(){
        return a ;
    }
    int getB(){
        return b;

    }

    int add() {
        return a+b;
    }
    int sub() {
        return a-b;
    }
}

class Final_Cal extends  Calculator {
    int mult(){
        return getA()*getB();
    }
    int div() {
        return getA()/getB();
    }
}

public class Inherit_cal {
    public static void main(String[] args) {
        Final_Cal f1 = new Final_Cal();
        System.out.println("Enter 2 numbers");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        f1.setNum(x, y);
        System.out.println("The sum is "+f1.add());
        System.out.println("The difference is "+f1.sub());
        System.out.println("The product is "+f1.mult());
        System.out.println("The quotient is "+f1.div());
    }
}
