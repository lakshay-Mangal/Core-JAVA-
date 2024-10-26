import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Enter the time of day");
        Scanner sc= new Scanner(System.in);

        String s = sc.next();
        if(s.equals("morning"))
        System.out.println("Good Morning");
        else if (s.equals("afternoon"))
        System.out.println("Good Afternoon");
        else if(s.equals("evening"))
        System.out.println("Good evening");
        else
        System.out.println("Only 3 imputs given");
    }    
}
