import java.util.Scanner;

public class Max3 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x>=y && x>=z)
        System.out.println(x +" is greatest");
        if(y>=z && y>=x)
        System.out.println(y+ " is greatest");
        if(z>=y && z>=x)
        System.out.println(z+" is greatest");

    }
}
