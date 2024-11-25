
import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp= num * num,res=0;
        while(temp!=0){
            int x= temp%10;
            res+=x;
            temp/=10;
        }
        System.out.println(res==num ? "Neon" : "Not Neon");
    }
}
