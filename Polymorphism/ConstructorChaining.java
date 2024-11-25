class A{
    A( ) {
        System.out.println("Default Constructor 1 ");
    }
    A(int a){
            this();
        System.out.println("2nd constructor parameterized");
    }
    A(int a, int b){
            this(5);
            System.out.println("Third Construtor 2 parameters");
    }

}

public class ConstructorChaining{
    public static void main(String [] args){
        new A(6,7);
    
    }
}