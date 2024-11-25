
import java.util.Scanner;

public class Check_Palin {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp =num;
        int rev =0;
        while(temp!=0){
            int rem= temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if(num==rev)
            System.out.println("Palindrome");
            else
            System.out.println("Not Palindrome");
        
    }
}
