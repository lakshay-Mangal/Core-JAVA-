package Method;

import java.util.Scanner;


class Fun{
    static int power(int num, int power)
    {
        int res=1;
        while(power!=0)
        {
            res*=num;
            power--;
        }
        return res;
    }
    boolean even()
    {  
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        return x/2==0;
    }
    boolean armstrong()
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int temp =x,count=0;
        while(temp!=0)
        {
            temp/=10;
            count++;
        }  
        temp=x;
        int arm=0;
        while(temp!=0)
        {
            int rem=temp%10;
            arm+= power(rem,count);
            temp/=10;
        }      
       return x==arm;
    }
    boolean palindrome()
    {
       
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int temp =x,rev=0;
       
        while(temp!=0)
        {
            int rem=temp%10;
            rev= rev*10+rem;
            temp/=10;
        }      
       return x==rev;
    }
    int factorial()
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int fact=1;
        while(x!=0)
        {
            fact*=x;
            x--;
        }
        return fact;
    }
    boolean neon()
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int temp=x*x,neon=0;
        while(temp!=0)
        {
            int rem= temp%10;
            neon+=rem;
            temp/=10;
        }
        return neon==x;
    }


}


public class Main{
    public static void main(String[] args) {
        Fun a= new Fun();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String x = sc.nextLine();
         x = x.toLowerCase();
        if(x.equals("armstrong")) {
        if(a.armstrong())
        System.out.println("Armstrong");
        else
        System.out.println("Not armstrong");

        }
        if(x.equals("palindrome"))
        {
        if(a.palindrome())
        System.out.println("Palindrome");
        else
        System.out.println("Not palindrome");
        }

        if(x.equals("neon")) {
        if(a.neon())
        System.out.println("Neon");
        
        else
        System.out.println("Not neon");
        }
        if(x.equals("factorial"))
        System.out.println("Factorial is "+a.factorial());

        if(x.equals("even"))
        {
            if(a.even())
            System.out.println("Even");
            else
            System.out.println("Odd");
        }
    }
}
