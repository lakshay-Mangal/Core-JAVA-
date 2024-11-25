//Calling instance variable from parent class

class A{
    String myName = "Lakshay";
}
class B extends A{
    String myName= "Mangal";
    void printName(){
        System.out.print(super.myName +" ");
        System.out.print(myName);

    }
}


public class SuperUse1 {
    public static void main(String [] args){
        B obj = new B();
        obj.printName();
    }
}
