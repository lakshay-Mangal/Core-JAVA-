import java.util.Scanner;


public class Armstrong {
    public static int power(int num, int power){
        int ans=1;
        while(power!=0){
            ans*=num;
            power--;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("All armstrong numbers are:");


        for (int i=1;i<=x;i++){
            int temp =i, power=0;
            while(temp!=0){
                temp/=10;
                power++;
            }
            temp =i;
            int res=0;
            while(temp!=0){
                int rem = temp%10;
                res = res + power(rem,power);
                temp/=10;
            }
            if(i==res)
            System.out.println(i);

        }
}
}
