import java.util.*;


public class Test {
    public static void main(String [] args)
    {
        System.out.println("Enter 3 numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();


        if(x>=y && x>=z)
        System.out.println(x+ " is greatest");
        else if(y>=z && y>=x)
        System.out.println(y+ " is greatest");
        else if (z>=x && z>=y)
        System.out.println(z+ " is greatest");


    }
}
