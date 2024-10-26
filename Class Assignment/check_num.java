
import java.util.Scanner;


public class check_num {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>0)
        System.out.println("Positive");
        else if(x<0)
        System.out.println("Negative");
        else
        System.out.println("Zero");
    }
}
