import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Enter your BMI");
        Scanner sc = new Scanner(System.in);
        double bmi = sc.nextDouble();
        if(bmi<18.5)
        System.out.println("Underweight");
        else if(bmi<24.9 && bmi>18.5)
        System.out.println("Overweight");
        else
        System.out.println( "Kaustubh");
    }
}
