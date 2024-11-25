interface A{
    void show1();
}

 interface B extends A  {
    void show2();    
}


class C implements  B {
    public void show1(){
        System.out.println("A interface");
    }
    public void show2() {
        System.out.println("B interface");
    }
}

public class InterfaceTOInterface {
public static void main(String[] args) {
    C obj = new C();
    obj.show1();
    obj.show2();
}    
}
