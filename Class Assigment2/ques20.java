
import java.util.Scanner;


public class ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int i=1;
       int sum=0;
       while(i<=100)
       {
        if(i%2==1)
        sum+=i;
        i++;
       }
       System.out.println("Sum is :"+sum);
    }
    
}
