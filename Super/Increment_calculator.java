package Super;
import java.util.*;
public class Increment_calculator {
    public static void main(String[] args) {
        System.out.println("Enter your Salary and rating");

            Scanner sc = new Scanner(System.in);
            int sal = sc.nextInt();
            double x = sc.nextDouble();
            double inc =0;
            if(sal<0)
            {
                System.out.println("Invalid");
            }
            if(x>=1 && x<=3)
            inc = 0.10;
            else if (x>3 &&  x<=4)
            inc = 0.25;
            else if(x>4)
            inc = 0.3;
            else
            {
                System.out.println("Invalid");
            }
            double total;
            total = sal+ (sal*inc);

            System.out.println("Final Compensation is " + total);
    }
}
