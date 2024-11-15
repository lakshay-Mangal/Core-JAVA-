
import java.util.Scanner;

class Add{
    Add(int a, int b){
        System.out.println("The sum is "+(a+b));
    }
}


public class ParameterAdd {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();

        new Add(a,b);
    }
}
