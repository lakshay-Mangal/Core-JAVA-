
import java.util.Scanner;

public class Palindrome {
    public static void main( String [] args)
    {
        System.out.println("Enter a number or string");
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int start=0, end=s.length()-1;
        boolean palindrometrue=true;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                palindrometrue=false;
                System.out.println("Not palindrome");
                return ;
            }
            start++;
            end--;
        }
        if(palindrometrue)
        System.out.println("Palindrome");
        else
        System.out.println("Not palindrome");
    }
}
