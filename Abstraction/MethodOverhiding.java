class A{
    static void show(){
         System.out.println("hello");
     } 
 }
 class B extends A{
     static  void show(){
        super.show();
         System.out.println("world");
     }
 }
 public class MethodOverhiding {
     public static void main(String[] args) {
         B p=new B();
         p.show();
     }
 }
 