
import java.util.Scanner;


public class Temp {
    public static void main(String[] args) {
        System.out.println("Enter your marks out of 100");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks >100)
        {
            System.out.println("Invalid Marks");
        }
      else if(marks>90 )
      { System.out.println("A grade");
        }
       else if(marks>75)
       { System.out.println("B grade");
        }
        else if (marks >60){
        System.out.println("C grade");
       }
       else if (marks >45){
        System.out.println("D grade");
       }
       else
       {
        System.out.println("Fail");
       }
    }
    }

