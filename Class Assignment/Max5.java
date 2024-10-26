import java.util.Scanner;

public class Max5 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int p = sc.nextInt();
        int q= sc.nextInt();

        if(x>=y && x>=z && x>=p && x>=q)
        System.out.println(x +" is greatest");
        if(y>=z && y>=x && y>=p && y>=q)
        System.out.println(y+ " is greatest");
        if(z>=y && z>=x && z>=p && z>=q )
        System.out.println(z+" is greatest");
        if(p>=x && p>y && p>=z && p>=q )
        System.out.println(p +"is greatest");
        if(q>=x && q>=y && q>=z && q>=p)
        System.out.println(q+ " is greatest");
    }
}
