class A {
    void show1() {
        System.out.println("A class");      //JAVA DOES NOT SUPPORT MULTIPLE INHERITENCE
    }
}
class B {
    void show2() {
        System.out.println("B class");
    }
}
class C {
    void show3() {
        System.out.println("C class");
    }
}
class D extends  A,B,C {        //We are getting ambiguity error.
    void  show4(){ 
        System.out.println("D class");
    }
}
public class MultipleInheritence {
    public static void main(String[] args) {
        D obj = new D();
        obj.show1();
    }
}