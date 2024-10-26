package advance;
import java.util.*;
public class Mark {

  public static void main(String[] args) {
          System.out.println("Enter your marks out of 100 in 5 subjects");
          Scanner sc = new Scanner(System.in);
          int m1 = sc.nextInt();
          int m2= sc.nextInt();
          int m3 = sc.nextInt();
          int m4 = sc.nextInt();
          int m5 = sc.nextInt();
          int marks = m1+m2+m3+m4+m5;

          if(marks >500)
          {
              System.out.println("Invalid Marks");
          }
          double grade =0;
          grade = marks/5;

         if(grade>90 )
        { System.out.println("A grade");
          }
         else if(grade>75)
         { System.out.println("B grade");
          }
          else if (grade >60){
          System.out.println("C grade");
         }
         else if (grade >45){
          System.out.println("D grade");
         }
         else
         {
          System.out.println("Fail");
         }
      }

  }
  

