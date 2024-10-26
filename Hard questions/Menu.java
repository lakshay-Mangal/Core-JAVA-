import java.util.*;
public class Menu {
    public static void main(String[] args)
    {
        System.out.println("Enter a dish number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        @SuppressWarnings("unused")
        int price =0;

        switch(num)
        {
            case 1 -> price = 100;
            case 2 -> price =254;
            case 3 -> price =299;
            default -> System.out.println("Only 3 dishes available at the moment");
        }
        System.out.println("You have selected dish no. "+ num + "\n The price is "+price);
    }
}
