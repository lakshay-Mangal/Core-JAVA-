import java.util.Scanner;

public class While_loop {
    public static void main(String[] arsg)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++)
        System.out.println(i);
        System.out.println("Now while");
        while(x!=0)
        {
            System.out.println(x);
            x--;
        }
    }

}
