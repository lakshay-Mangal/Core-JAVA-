import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2= sc.nextInt();
        x1= x1+x2;
        x2= x1-x2;
        x1=x1-x2;
        System.out.println("New x1 : " +x1 +"\n New x2 : "+x2);
    }
}
