import java.util.Scanner;

public class Swap_third {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x = sc.nextInt();
        int y= sc.nextInt();
        int z=0;
        z=x;
        x=y;
        y=z;
        System.out.println("New x: "+x +"\n New y: "+y  );
    }
}
