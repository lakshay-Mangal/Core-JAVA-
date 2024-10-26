
import java.util.*;
public class ques3{
    public static void main(String[] args) {
        System.out.println("Enter the number b/w whom table you want");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while(num1<=num2){
            int a=1;

            while(a<=10){
                System.out.print(num1*a+" ");
                a++;
            }
            num1++;
            System.out.println();
        }
    }
}