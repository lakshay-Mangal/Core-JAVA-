abstract  class A{
    abstract  void show();
}

abstract  class B extends A{
    abstract void show1();
}

class C extends B{
    void show(){
        System.out.println(" This is A class abstract method ");
    }

    void show1(){
        System.out.println("This is B class abstract method");
    }
}


public class ConceptAbstract {
    public static void main(String[] args) {
        // C p = new C();
        B p = new C();
        p.show();
        p.show1();
    }
}
