class A{
    A(){
        System.out.println("This is constructor of class A");
    }
    A(String name){
        System.out.println("Parameterized Constructor of class A "+name);
    }
}




public class Ques3 {
    public static void main(String[] args) {
        new A();
        new A("Lakshay");
    }
}
