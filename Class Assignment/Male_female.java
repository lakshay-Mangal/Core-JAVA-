
import java.util.Scanner;


public class Male_female {
    public static void main(String[] args) {
        System.out.println("Enter a character");
       Scanner sc = new Scanner(System.in) ;
       char x = sc.next().charAt(0);
        switch (x) {
            case 'm' -> System.out.println("Male");
            case 'f' -> System.out.println("Female");
            default -> System.out.println("Other");
        }
    }   
}
