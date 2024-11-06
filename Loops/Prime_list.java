
import java.util.Scanner;

public class Prime_list {
    public static void main(String[] args) {
        System.out.println("Enter the range");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean isprime= true;
        for(int i=x;i<=y;i++)
        {   
            isprime=true;

            if(i<=1)
            isprime=false;
            
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0){
                isprime=false;
                    break;
                }
            }

            if(isprime)
            System.out.println(i);
        }
    }
}
