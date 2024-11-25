class A{    

    void statement(){
        System.out.println("This is class A public method");
    }
}

class B extends  A{
    void statement2(){
        System.out.println("This is class B public method");
    }
}
class C extends  B{
    void statement3(){
        System.out.println("This is class C public method");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.statement();
        obj.statement2();
        obj.statement3();

    }
}
