import java.util.Scanner;

public class upper_case {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if(x>= 'A' && x<='Z')
        System.out.println("Upper case" );
        else if (x>='a' && x<='z')
        System.out.println("LowerCase");
        else{
            System.out.println("invalid");
        }
    }
}
