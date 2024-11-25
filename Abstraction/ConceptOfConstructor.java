abstract class A{
    void show1() {
        System.out.println("Non abstract Method");
    }
    abstract void show();
}
class B extends A{
    void show() {
        System.out.println("Abstract method");
    }
    void show3(){
        System.out.println("B class Method");
    }
}
public class ConceptOfConstructor {
    public static void main(String[] args) {
        A rv = new B();
        rv.show();
        rv.show1();
        
    }
}
