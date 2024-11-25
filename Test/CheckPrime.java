import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean isprime = true;
        if(x== 0| x==1)
        System.out.println("The number is non prime");

        if(x>=2){
            for(int i=2;i<x;i++){
                if(x%i==0) 
                isprime=false;
                           
            }
            if(isprime)
            System.out.println("The number is prime");
            else
            System.out.println("The number is non prime");
        }
    }
}
