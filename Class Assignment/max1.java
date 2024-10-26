
import java.util.Scanner;


public class max1 {
    public static void main(String [ ] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = scanner.nextInt();
        if(x>10)
        System.out.println("Greater than 10");
        else
        System.out.println("Less than 10");
    }
}
