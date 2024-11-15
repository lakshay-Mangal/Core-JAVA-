class A {
    int a =67;   //Instance Variable

    void show(){
        int a= 86;   //Local Variable
        System.out.println(a+ " ");
    }
    
    public int getA() {
        return a;
    }
}

public class InstanceVariable {
    public static void main(String[] args) {
        A var = new A();
        var.show();
        int x= var.getA();
        System.out.println(x);
    }
}