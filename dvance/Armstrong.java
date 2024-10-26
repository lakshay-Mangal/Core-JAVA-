package dvance;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sq =num*num;
        int sum =0;
        while(sq!=0)
        {   int rem;
            rem= sq%10;
            sum+=rem;
            sq=sq/10;
        }
        if(num==sum)
        System.out.println("Neon");
        else
        System.out.println("Not Neon");
    

    }
}
