import java.util.Scanner;

class Operations{
    int add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x= sc.nextInt();
        int y= sc.nextInt();
        return x+y;
    }
    int sub()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x= sc.nextInt();
        int y= sc.nextInt();
        return x-y;
    }
    int prod()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x= sc.nextInt();
        int y= sc.nextInt();
        return x*y;
    }
    int quot()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x= sc.nextInt();
        int y= sc.nextInt();
        return x/y;
    }
    int rem()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x= sc.nextInt();
        int y= sc.nextInt();
        return x%y;
    }
    

}
public class Ques1 {
    public static void main(String[] args) {
        Operations m1 = new Operations();
      System.out.println("The sum is "+ m1.add()); 
       System.out.println("The remainder is "+m1.rem()); 
    }
}
