import java.util.*;
public class Magic_band {
    public static void main(String[] args) {
        System.out.println("Enter 4 numbers");
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[4];
       for(int i=0;i<4;i++)
       {
            numbers[i]= sc.nextInt();
       }
       for(int num: numbers)
       {
           char ch= (char)num;
           System.out.println(ch);
       }
      sc.close();
    }
}
