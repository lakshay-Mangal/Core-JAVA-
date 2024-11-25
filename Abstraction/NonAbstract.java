//Abstract class and make abstract method and non-abstract method

abstract class A{
    //non abstract method : body define
   void show(){
        System.out.println("Class A show method non -abstract");
    }
    abstract  void show2();
}
//abstract method
class B extends A{
    void show2(){
        System.out.println("This is an abstract method declared in class A but defined in class B");
    }
}




public class NonAbstract {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.show2();
    }
}
