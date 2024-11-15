class A {
    void show1() {
        System.out.println("A class");      //JAVA DOES NOT SUPPORT MULTIPLE INHERITENCE
    }
}
class B extends A {
    void show2() {
        System.out.println("B class");
    }
}
class C extends A{
    void show3() {
        System.out.println("C class");
    }
}
class D extends  A {        
    void  show4(){ 
        System.out.println("D class");
    }
}


public class Hierarchical {
    public static void main(String[] args) {
        D obj = new D();
        obj.show1();
        B obj2 = new B();
        obj2.show1();

    }
}
