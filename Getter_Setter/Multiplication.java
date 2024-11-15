import java.util.Scanner;

class Multiply{
    int a,b,c;
    void setNumbers(int a ,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    int getA(){
        return a;
    }
    int getB(){
        return b;
    }
    int getC(){
        return c;
    }
    int getMult(int a, int b ,int c){
        return a*b*c;
    }

}
public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int z = sc.nextInt();
        Multiply m1 = new Multiply();
        m1.setNumbers(x,y,z);
        System.out.println("The product is "+ m1.getMult(x,y,z));
    }

  
}
