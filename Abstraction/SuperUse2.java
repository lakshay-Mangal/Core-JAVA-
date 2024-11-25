//Calling a method from the parent class

class A{
    void printName(){
        System.out.println(" Lakshay from class A");
    }
} 
class B extends A{
    void printName(){
        System.out.println("Lakshya from class B");
        super.printName();
    }
}

public class SuperUse2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.printName();
    }
}
