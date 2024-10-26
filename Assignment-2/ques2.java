import java.util.*;

public class ques2 {
    public static int sum(int a, int b )
    {   
        int s =a+b;
        return s;
    }
    public static int sub(int a ,int b)
    {
        int d= a-b;
        return d;
    }
    public static int mul(int a ,int b)
    {
       return a*b;
        
    }
    public static int div(int a ,int b)
    {
        int d= a/b;
        return d;
    }
    public static void main(String [] args)
    {
        System.out.println("Enter 2 numbers");
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        System.out.println("The sum is : " +sum(a, b));
        System.out.println("The subtraction is :"+ sub(a, b));
        System.out.println("The multiplication is :"+ mul(a, b));
        System.out.println("The division is :"+ div(a, b));




    }
}
