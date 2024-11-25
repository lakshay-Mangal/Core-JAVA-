abstract  class A{
    int number = 545;
    
    abstract void method1(int x);

    void method2 (int num){
    System.out.println("This is method overloading with argument "+num);
    }
    void method2(){
        System.out.println("This is method overloading without any arguments");
    }
}
class B extends A{

   
   void method1(int x){
    System.out.println("This is abstract method "+x);
   }
}
public class Ques2 {
 public static void main(String[] args) {
     B obj = new B();
     obj.method1(5);
     obj.method2(43);
     obj.method2();
 }   
}
