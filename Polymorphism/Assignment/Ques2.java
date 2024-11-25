

class  A{
    double show(double a){
        return a;
    }
    int show(int a){
        return a;
    }
}

class B extends A{
    void show1(){
        System.out.println("B class show1 method");
        
    }
    void show1(String name){
        System.out.println(name);
    }
}
class C extends A{
    void show2(){
        System.out.println("C class show2 method");
        
    }
    void show2(String name){
        System.out.println(name);
    }
}
class D extends A{
    void show3(){
        System.out.println("D class show 3 method");
    }
    void show3(String name){
        System.out.println(name);
    }
}

public class Ques2 {
    public static void main(String[] args) {
        D obj = new D();
        double x= obj.show(5.6);
      int y = obj.show(5);
      System.out.println(x +" "+y +" ");
        obj.show1();
        obj.show1("Lakshay");
        obj.show2();
        obj.show2("Lakshay");

        obj.show3();
        obj.show3("Lakshay");

    }
}
