package advance;
import java.util.*;
public class Main {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

            System.out.println("Enter your name");
            String name = sc.nextLine();
            System.out.println("Enter your father's name");
            String fname = sc.nextLine();
            System.out.println("Enter your roll number");
            int roll = sc.nextInt();

          System.out.println("Enter your marks out of 100 in 3 subjects");
          int m1 = sc.nextInt();
          int m2= sc.nextInt();
          int m3 = sc.nextInt();
         
          int marks = m1+m2+m3;

          if(marks >300)
          {
              System.out.println("Invalid Marks");
              return ; 
          }
          double percentage;
          percentage = marks/3;
          System.out.println("Name: "+name);
          System.out.println("Father's name: "+fname);
          System.out.println("Roll no.: "+roll);
          System.out.println("Percentage: "+percentage);
          System.out.print("Grade :");

         if(percentage>90 )
        { System.out.print("A grade");
          }
         else if(percentage>75)
         { System.out.print("B grade");
          }
          else if (percentage >60){
          System.out.print("C grade");
         }
         else if (percentage >45){
          System.out.print("D grade");
         }
         else
         {
          System.out.print("Fail");
         }
      }

  }
  


