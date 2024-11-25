import java.util.Scanner;

public class Ques1 {
     public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=0;i<x;i++){
            for(int j=x ;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}