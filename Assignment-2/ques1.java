import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number");
            int a = sc.nextInt();
            System.out.println("now enter any double");
            double b= sc.nextDouble();
            System.out.println("This time enter a character");
            char c = sc.next().charAt(0);
            System.out.println("The number is "+a +"\n The double number is "+b + "\n The character si "+c);
        }
    }
}
