abstract  class A{
    A(){
        System.out.println("hello");
    }
}
class B extends A{

    B(){
    System.out.println("World");            
    }

}

public class ConstAbstract {
    public static  void main(String [] args){
        new B();
    }
}
