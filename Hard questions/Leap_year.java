import java.util.*;

public class Leap_year {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                System.out.println("Leap year");
                else
                System.out.println("Normal year");
            }
            else
            System.out.println("Leap year");
        }
        else
        System.out.println("normal year");
    }
}
