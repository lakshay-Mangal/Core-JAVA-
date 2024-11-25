import java.util.Scanner;

class A{
    int method1(int a ){
        return a*a;

    }
}
class B extends A{
    void  method2(){
        System.out.println("This is class B public method");

    }
}
class C extends  B{
    String method3( ){
        String x=  "This is class C public method";
        return x;

    }
}
class D extends C{
    boolean method4(int a ){
        return a%2==0;

    }
}
class E extends D{
    String method3( ){
        String x=  "This is class E public method";
        return x;

    }
}
class F extends E{
    F covRet(){
        System.out.println("This is classs F covarient method");
        return this;
    }
}

public class Multilevel2 {
    public static void main(String[] args) {
        F obj = new F();
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        obj.method1(a);
        
    }
}
