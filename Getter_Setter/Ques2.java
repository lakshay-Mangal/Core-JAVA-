
import java.util.Scanner;

class Addition{
    int a,b,c,d,e,f,g;
    void setSum(int a, int b ,int c ,int d, int e, int f ,int g ) {
        this.a= a;
        this.b=b;
        this.c=c;
        this.d = d;
        this.e=e;
        this.f =f;
        this.g =g;
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
    int getD(){
        return d; 
    }
    int getE(){
        return e; 
    }
    int getF(){
        return f; 
    }
    int getG(){
        return g; 
    }
    int getSum(int a, int b, int c ,int d, int e, int f ,int g){
        int x= a-(b+c+d+e+f+g);
        return x;
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int t= sc.nextInt();
        int u= sc.nextInt();
        int v= sc.nextInt();

        Addition num = new Addition();
        num.setSum(p, q, r, s, t,u,v);
      System.out.println("The difference is "+num.getSum(p, q, r, s, t,u,v));  
    }
}
