
import static java.lang.System.out;
import java.util.Scanner;


public class charmatch {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        switch (x) {
            case 'a' -> out.println("Apple");
            case 'b' -> System.out.println("Ball");
            case 'c' -> System.out.println("Cat");
            default -> System.out.println("None of the above");
        }
    }
}
