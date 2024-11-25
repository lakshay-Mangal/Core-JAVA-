abstract class A{
    abstract  void method1();
    abstract void method1(int a);
    abstract  int method1();
    abstract  int method1(int a);
    abstract A method1();
 }
 
 class B extends A{
     void method1(){
         System.out.println("Method 1 class A");
     }
     void method1(int a ){
         System.out.println(a);
     }
     int method1(){
         int num=4;
         return  num;
     }
     int method1(int a){
         return a;
     }
     A method1(){
         System.out.println("This is a covarient  type");
         return this;
     }
 }
 public class Ques {
     public static void main(String[] args) {
         B obj = new B();
         obj.method1();
         obj.method1(3);
         obj.metho
         
     }   
 }
 