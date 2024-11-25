class A{
     A(int a ){
        System.out.println("A class show Constructor");
    }
    A(){
        System.out.println("A class default const");
    }    
}
class B extends  A{
    B(){
        super(34);
        System.out.println("B class show const");
    }
}
public class SuperKeyword2 {
    public static void main(String[] args) {
        new B();
    }
}
