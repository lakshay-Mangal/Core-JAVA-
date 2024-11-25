
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {
        System.out.println("Enter number and power");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int res =1;
        while(pow!=0){
            res =res*num;
            pow--;
        }
        System.out.println("The result is "+res);

    }
}
