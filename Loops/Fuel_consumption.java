
import java.util.Scanner;



public class Fuel_consumption {
    public static void main(String[] args) {
        System.out.println("Enter the no. of liters to fill up the tank and the distance travelled respectively");
        Scanner sc = new Scanner(System.in);

        double fuel = sc.nextInt();
        double distance= sc.nextInt();
        if(fuel <=0 || distance <=0)
      {  System.out.println("Invaldi input");
      return;
    }
        System.out.printf("Liter/100km : %.2f%n",((fuel/distance)*100));
        double mile= distance *0.6214;
        double gallon= fuel*0.2642;
        System.out.printf("Miles/gallon :%.2f%n",mile/gallon);
    }
}
