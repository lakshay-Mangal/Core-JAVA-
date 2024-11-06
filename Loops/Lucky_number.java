import java.util.Scanner;

public class Lucky_number {
    public static void main(String[] args) {
        System.out.println("Enter a numbre");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temm= n;
        int count=0;
        while(temm!=0)
        {
            temm/=10;
            count++;
        }
        if(count!=4)
        {System.out.println("Invalid Number");
        return ;
    }
        if(n%7==0 ||n%3==0 ||n%5==0)
        System.out.println("Lucky number");
        else
        System.out.println("Not Lucky number");
    }

}
