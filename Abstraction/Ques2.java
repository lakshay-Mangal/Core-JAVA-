

abstract class A {
    abstract void method1();

}

class B extends A{
    void method1(){
        System.out.println("Abstract class A method");
    }
}
class C extends B{
    void method2 (){
        System.out.println("Class C method");
    }
    void method1(){
        System.out.println("Abstract class A method in B CLASS");
    }
}

public class Ques2 {
    public static void main(String[] args){
        C obj = new C();
        obj.method1();
        obj.method2();

    }   
}
