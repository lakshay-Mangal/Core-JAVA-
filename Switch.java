import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;


public class Switch {
    public static void main(String [] args)
    {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(n);
        switch (n) {
            case 1 : {
            for(int i=0;i<5;i++)
        {
            {
                for(int j=0;j<5;j++)
                System.out.print('*');

            }
            System.out.println();
            
        }
        break;
    }       case 2: {
        for(int i=0;i<5;i++)
        {
            {
                for(int j=0;j<i;j++)
                System.out.print('*');

            }
            System.out.println();
            
        }
        break;
    }
    case 3 : {
        for(int i=0;i<5;i++)
    {
        {
            for(int j=0;j<i;j++)
            System.out.print(" ");

            for(int k=0;k<i;k++)
            System.out.print(" *");

        }
        System.out.println();
        
    }
    break;

    }
    case 4 : {
        for(int i=0;i<5;i++)
    {
        {
            for(int j=0;j<5;j++)
            System.out.print(i);

        }
        System.out.println();
        
    }
    break;
}
case 5 : {
    for(int i=0;i<5;i++)
{
    {
        for(int j=0;j<5;j++)
        System.out.print(j);

    }
    System.out.println();
    
}
break;
}
case 6: {
    for(int i=0;i<5;i++)
{
    {
        for(int j=0;j<i;j++)
        System.out.print(i);

    }
    System.out.println();
    
}
break;

}
case 7 : {
    for(int i=0;i<5;i++)
{
    {
        for(int j=0;j<i;j++)
        System.out.print(j);

    }
    System.out.println();
    
}
break;
}
case 8 : {
        for(int i=0;i<5;i++)
    {
        {
            for(int j=0;j<5;j++)
            if(i==0||i==4||j==0||j==4)
            System.out.print("*");
            else
            System.out.print(" ");

        }
        System.out.println();
        
    }
    break;
}

default : System.out.println("Invalid");
}
    }
}
