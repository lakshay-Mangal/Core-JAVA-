

class A{
    void show(){
        System.out.println("First Method");

    }

    void show(int a){
        System.out.println("Second Method "+ a);
    }

}
class B{
    void fun(int a , int b){
        System.out.println(a+b);
    }
    void fun(float a, float b){
        System.out.println(a+b);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(4);
        B obj2 = new B();
        obj2.fun(1.2f, 3.2f);
        obj2.fun(4, 5);
    }
}
