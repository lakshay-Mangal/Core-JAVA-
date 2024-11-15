

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
    boolean even(int x)
    {  
        
       if(x%2==0)
       return true;
       else
       return false;
    }
    boolean armstrong(int x)
    {
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
    boolean palindrome(int x)
    {
       
        int temp =x,rev=0;
       
        while(temp!=0)
        {
            int rem=temp%10;
            rev= rev*10+rem;
            temp/=10;
        }      
       return x==rev;
    }
    int factorial(int x)
    {
       
        int fact=1;
        while(x!=0)
        {
            fact*=x;
            x--;
        }
        return fact;
    }
    boolean neon(int x)
    {
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


public class Functions{
    public static void main(String[] args) {
        Fun a= new Fun();

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(a.armstrong( x)) 
        System.out.println("Armstrong");
        else
        System.out.println("Not armstrong");
        if(a.palindrome( x))
        System.out.println("Palindrome");
        else
        System.out.println("Not palindrome");
        if(a.neon( x))
        System.out.println("Neon");
        else
        System.out.println("Not neon");
        if(a.even(x))
        System.out.println("Even");
        else
        System.out.println("Odd");
        
        System.out.println("Factorial is "+a.factorial( x));
        
    }
}
