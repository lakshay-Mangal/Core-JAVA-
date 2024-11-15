
import java.util.Scanner;
class Divide{
    int a, b;
    void setA(int a, int b) {
        this.a =a;
        this.b=b;
    }
    int getRes(int x, int y){
        return a/b;
    }
}
public class Division_getter {
 public static void main(String[] args) {
     System.out.println("Enter the divident and divisor");
     Scanner sc = new Scanner(System.in);
     int x= sc.nextInt();
     int y =sc.nextInt();
     Divide num= new Divide();
     num.setA(x, y);
     System.out.println(num.getRes(x,y));

 }   
}
