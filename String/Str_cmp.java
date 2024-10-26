package String;

import java.util.Scanner;

public class Str_cmp {
    public static void main(String [] args)
    {
        System.out.println("Enter your first name and last name respectively");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.equals(s2))
        {
            System.out.println("First name and last name are same");

        }
        else
        System.out.println("Not Same");
    }
}
