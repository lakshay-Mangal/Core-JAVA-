
import java.util.Scanner;

public class Pizza_order {
    public static void main(String[] args) {
        System.out.println("Enter your order (no. of pizza, puffs and cold-drinks respectively)");
        Scanner sc = new Scanner(System.in);
        int p= sc.nextInt();
        int pp= sc.nextInt();
        int cd= sc.nextInt();
        int pc = 100, ppc=20, cdc=10;
        int fc = (p*pc) + (pp*ppc) + (cd*cdc);
        System.out.println("Bill Invoice");
        System.out.println("Pizza :"+p*pc);
        System.out.println("Puffs :"+pp*ppc);
        System.out.println("Cold drinks :"+cd*cdc);
        System.out.println("Total cost :"+fc);
        System.out.println("ENJOY THE SHOW");

    }
}
