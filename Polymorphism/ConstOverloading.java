class A{
    A(){
        System.out.println("Constructor without any parameter");
    }
    A(int a){
        System.out.println("Constructor with an int parameter "+a);
    }
    A(int a , int b){
        System.out.println("Constructor with 2 parameters "+a+"and "+b);
    }
}
class B{
    B(){
        System.out.println("Constructor without any parameter");

    }
    B(int a ){
        System.out.println("Constructor with a single int paramter "+a);
    }
    B(float a){
        System.out.println("Constructor with a single FLOAT parameter "+a);
    }
}
public class ConstOverloading {
    public static void main(String[] args) {
        new A(5);
        new A(5,7);
        new B();
        new B(0.9f);
    }
}
