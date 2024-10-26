
import java.util.Scanner;


public class Vowel_consonent {
    public static void main(String [] args)
    {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a =='a' || a=='e'|| a=='i'|| a=='o'|| a=='u')
        System.out.println("Vowel");
        else
        System.out.println("Consonent");

    }
}
