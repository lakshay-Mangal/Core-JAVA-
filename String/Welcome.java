package String;

import java.util.Scanner;

public class Welcome {
    public static void main(String [] arsh)
    {
      String s1 = "Welcome";
        Scanner sc = new Scanner(System.in);
        String s2= sc.nextLine();

    if(s1.equals(s2))
    {
        System.out.println("Both equal");
    }
    else
    System.out.println("Not equal");

}
}
