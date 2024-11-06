
import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        System.out.println("Enter the no. of Students placed in CSE , ECE and MECH respectively");
        Scanner sc = new Scanner(System.in);
        int cse= sc.nextInt();
        int ece = sc.nextInt();
        int mech= sc.nextInt();

       if(cse <0 || mech<0 ||ece<0)
       System.out.println("Invalid input"); 
        if(cse> ece && cse > mech)
        System.out.println("CSE has scored highest placements");
        else if(ece>mech && ece> cse)
        System.out.println("ECE department has scored highest placements");
        else if(mech>ece && mech>cse)
        System.out.println("Mechanical department has scored highest placements");
        else if(cse==mech && mech==ece)
        System.out.println("Neither department has highest placements");

}
}
