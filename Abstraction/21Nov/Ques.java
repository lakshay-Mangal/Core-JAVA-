abstract  class A{
    int ref =24;
    abstract String method1(int x);

    A covarientM(){
        System.out.println("This is covarient return type");
        return this;
    }
}
class B extends A{
    String method1(int num){
        String x = "Abstract method declared in class A but defined in class B";
        System.out.println("Returned number"+num);
        return x;
    }
}
public class Ques {
 public static void main(String[] args) {
     B obj = new B();
     System.out.println(obj.method1(5));
     obj.covarientM();
     System.out.println(obj.ref);
     
 }   
}
