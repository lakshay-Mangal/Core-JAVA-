package dvance;
import java.util.Scanner;

public class Reverse {
    public static void main(String [] args)
    {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int rev=0;
        int num = x;
        if(num<0)
        System.out.println("Number is Invalid");
        while(x!=0)
        {
            int rem;
            rem=x%10;
            rev = rev*10 +rem;
            x=x/10;
        }
        System.out.println("reverse is " + rev);
        if(rev==num)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}
