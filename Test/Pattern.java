import java.util.Scanner;

public class Pattern {
     public static void main(String[] args) {
        System.out.println("Enter 2 number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
       for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            if((i+j)/2==0)
            System.out.print("* ");
            else
            System.out.print(" ");
        }
        System.out.println();
       }
        
    }
}