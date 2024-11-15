
import java.util.Scanner;

class para {
    para(int num)
    {
        System.out.println(num);
    }
}
public class ParamterisedConst {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        new para(num);
    }
}
