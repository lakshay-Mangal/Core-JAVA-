
import java.util.Scanner;

class  A {
    int a;

    void show(int a) {
       this.a=a;
        System.out.println(a);
    }
}


public class InputInstance {
    public static void main(String[] args) {
        A newp= new A();
        System.out.println("Enter a number");
        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt();
        newp.show(x);
    }
}
