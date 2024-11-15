import java.util.Scanner;

class Ret_Ways {
        Ret_Ways(String name) {
            System.out.println("hello, "+name+" i am a constructor");
        }
        void hello(){
            System.out.println("Hello world");
        }
        void hello2(String name){
            System.out.println("Hello "+ name);
        }
        String hello3() {
            String x ="Hello! I am a return with no argument method";
            return x;
        }
        String hello4(String name) {
            String x=("Hello " + name + "i am a return with argument method");
            return x;
        }
    }



public class Const {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
         Ret_Ways r1= new Ret_Ways(name);
         r1.hello();
         r1.hello2(name);
        System.out.println(r1.hello3()); 
         System.out.println(r1.hello4(name));
    }
}
