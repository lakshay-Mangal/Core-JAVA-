
import java.util.Scanner;

class Addition {
    int a; 
    int b;
    void setter(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    int getter ()
    {
        return a;
    }
    int getter2()
    {
        return b;
    }
    int add()
    {
        return a+b;
    }
}

public class Add_getter_setter {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        Addition  num = new Addition();
        num.setter(a, b);
        num.getter();
        num.getter2();
        System.out.println("The sum is "+num.add());
        
    }
}
