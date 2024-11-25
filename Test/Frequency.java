
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num=  sc.nextInt();
        int fre1=0;
        int fre2=0;
        int fre3=0;
        int fre4=0;
        int fre5=0;
        int fre6=0;
        int fre7=0;
        int fre8=0;
        int fre9=0;
        int fre0=0;
        while(num>0){
            int x= num%10;
            if(x==0)
            fre0++;
            if(x==1)
            fre1++;
            if(x==2)
            fre2++;
            if(x==3)
            fre3++;
            if(x==4)
            fre4++;
            if(x==5)
            fre5++;
            if(x==6)
            fre6++;
            if(x==7)
            fre7++;
            if(x==8)
            fre8++;
            if(x==9)
            fre9++;
            num/=10;
        }
        System.out.println("Frequency of 0: " +fre0);
        System.out.println("Frequency of 1: " +fre1);
        System.out.println("Frequency of 2: " +fre2);
        System.out.println("Frequency of 3: " +fre3);
        System.out.println("Frequency of 4: " +fre4);
        System.out.println("Frequency of 5: " +fre5);
        System.out.println("Frequency of 6: " +fre6);
        System.out.println("Frequency of 7: " +fre7);
        System.out.println("Frequency of 8: " +fre8);
        System.out.println("Frequency of 9: " +fre9);
    }
}
