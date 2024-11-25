

class  A{
    A(int a){
        System.out.println(a);
    }
}

class B extends A{

     B(int a) {
        super(a);
    }
}
public class SuperUse3 {
    public static void main(String[] args) {
        B obj = new B(5);
    }   
}
