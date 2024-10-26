import java.util.Scanner;

public class user_input {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operation ");
        System.out.println("The sum is "+(a+b));
    }
}
