abstract class A{
   abstract  void method1();
}

abstract class B extends A{
    abstract void method2();
}
abstract class C extends B{
        abstract void method3();
    }
abstract class D extends C{
        abstract void method4();
    
}
class E extends D{
    void method1(){
        System.out.println("This is an abstract method from class A");
    }
    void method2(){
        System.out.println("This is an abstract method from class B");
    }
    void method3(){
        System.out.println("This is an abstract method from class C");
    }
    void method4(){
        System.out.println("This is an abstract method from class D");
    }
}

public class Ques3 {
    public static void main(String[] args) {
         E obj= new E();
        
         obj.method1();
         obj.method2();
         obj.method3();
         obj.method4();
    }
}
