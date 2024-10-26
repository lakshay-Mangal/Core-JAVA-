package advance;

import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        System.out.println("Enter your heigh (in cm)t");
        Scanner sc = new Scanner(System.in);
        double height= sc.nextDouble();

        if(height>=180)
        System.out.println("Tall");
        else if (height>= 150)
        System.out.println("Mid");
        else{
            System.out.println("Low");
        }
    }
}
