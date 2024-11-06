import java.util.Scanner;

public class Swap_first_last {
    public static void main(String args[])
    {
        System.out.println("Enter the number ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n;
        int x=n%10;
        System.out.println("The last digit is "+ x);
        int place_value=1;
      while(n>=10)
      {
        n/=10;
        place_value*=10;
      }
      temp%=place_value;    //Is se first digit remove ho gya
      int new_num= x*place_value+temp; //Last digit first digit ki jagah aa gyi
      new_num=new_num-(new_num%10)+n;
      System.out.println("The first digit is "+n);
      System.out.println("The new number is "+new_num);
          
    }
}
