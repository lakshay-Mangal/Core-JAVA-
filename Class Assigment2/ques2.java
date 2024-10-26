import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        System.out.println("Enter the number whose table you want");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int a= 1;
        
        while(a <= 10)
        {   
            System.out.println(num1 +"* " +a+ "=" +num1*a );
            a++;
        }
       
    }
}