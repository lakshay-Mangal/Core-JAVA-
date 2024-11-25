
import java.util.Scanner;

class A{
    void method1(String a){
        System.out.println("This has a single parameter "+a+"");
    }
    int method1(int a){
         a =5;
        return a;
    }
}



public class Ques1{
    public static void main(String[] args){
        A obj = new A();
        int x=obj.method1(6);
        obj.method1("Hello");
        System.out.println(x);
        
    }
}