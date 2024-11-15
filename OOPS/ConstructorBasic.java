class A{
    //make constructor : explicit constructor
    A(){
        System.out.println("Hello World");
    }
}


public class ConstructorBasic{
    public static void main(String[] args)
    {
        new A();
        @SuppressWarnings("unused")
        A constr= new A(); 
    }
}