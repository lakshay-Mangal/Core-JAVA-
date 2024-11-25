class A{
    A(int x){
        System.out.println("This is class A parameterized const 1");
    }
    A(int x, int y){
        System.out.println("This is class A parameterized const 2");

    }
}
class B{
    int sum(int x,int y){
return x+y;
    }
    int sum(int x, int y, int z){
        int ans = x+y+z;
return ans;

    }
}
public class Ques4 {
    public static void main(String[] args) {
       new A(5);
       new A(4,5);
       B obj = new B();
       int x =obj.sum(3, 4);
       int y=obj.sum(3, 4,6);
       System.out.println(x+" "+y);
    }
}
