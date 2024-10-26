package advance;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything");
        String shape = sc.nextLine();
        System.out.println("Now enter if you want area or volume");
        String operation  = sc.nextLine();
        double area =0,volume=0;

       shape= shape.toLowerCase();
       operation= operation.toLowerCase();

        if(shape .equals("triangle"))
        {
            System.out.println("Enter Base and height ");
            int b = sc.nextInt();
            int h = sc.nextInt();

            if(operation.equals("area"))
            {
                area= 0.5 *b*h;
            }
            if(operation.equals("volume"))
            {
                System.out.println("Triangle has no volume");
            }
        }
        
        if(shape .equals("rectangle"))
        {
            System.out.println("Enter Length and Breadth ");
            int b = sc.nextInt();
            int l = sc.nextInt();

            if(operation.equals("area"))
            {
                area=b*l;
            }
            if(operation.equals("volume"))
            {
                System.out.println("Rectangle has no volume");
            }
        }
        
        if(shape .equals("Square"))
        {
            System.out.println("Enter Side ");
            int s = sc.nextInt();

            if(operation.equals("area"))
            {
                area= s*s;
            }
            if(operation.equals("volume"))
            {
                System.out.println("Square has no volume");
            }
        }
            System.out.println("The area of desired figure is "+ area);
            
    }
}
