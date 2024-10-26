import java.util.Scanner;

public class string_comp {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("apple"))
        System.out.println("A");
        else if (s.equals("mango"))
        System.out.println("m");
        else{
            System.out.println("Only 2 fruits available");
        }
    }
}
