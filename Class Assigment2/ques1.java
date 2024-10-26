
import java.util.Scanner;


public class ques1 {
    public  void even_print(int num)
    {
        while(num>=1)
        {
            if(num%2==0)
            System.out.print(num + " ");

            num--;

        }

    }
    public  void even_print_reverse(int num)
    {
        while(num<=100)
        {
            if(num%2==0)
            System.out.print(num + " ");

            num++;

        }

    }
    public void odd_print(int num)
    {
        while(num<=100)
        {
            if(num%2==1)
            System.out.print(num + " ");
            num++;

        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num=1;
        while(num<x)
        {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        System.out.println(" Now reverse");
        while(num>=1)
        {
            System.out.print(num + " ");
            num--;
        }
        System.out.println();
        ques1 p=new ques1();
       p. even_print(100);
       System.out.println();
       p.even_print_reverse(1);
       System.out.println();
       p.odd_print(1);
    }   
}
