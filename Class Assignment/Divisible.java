
import java.util.Scanner;


public class Divisible {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%11==0 && x%5==0)
        System.out.println("Diviisble by 11 and 5");
        else if (x%11==0 || x %5==0)
        System.out.println("Divisible by 11 or 5");
        else
        System.out.println("Divisible by neither");
    }
}
