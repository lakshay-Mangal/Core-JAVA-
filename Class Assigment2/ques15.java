
import java.util.*;
public class ques15 {
    public static void main(String[] args) {
        System.out.println("Enter the number b/w whom table you want");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
            int a=1;
            int x ;
            while(a<=10){
                x = num1*a;
                System.out.print(x+" ");
                a++;

            }
            
            System.out.println(x);
    }
}
