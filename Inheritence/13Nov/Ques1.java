class A{
      A() {
           System.out.println("Class A Default Constructor"); 
        }
        private int a,b;
        private int sumMethod(int a, int b ) {
           return a+b;
        }
        void setter(int a,int b){
            this.a=a;
            this.b=b;
        }
        int getA(){
            return a;
        }
        int getB(){
            return b;
        }
        public int sumMethod2(){
            A objA = new A();
            return objA.sumMethod(5,7);

        
        }
        
    }
    

class B extends A{
    B(){
        System.out.println("THis is a class B Default Constructor");
    }
    
    protected B method2(){
        System.out.println("This is a covarient return type varient");
        return this;
    }
    
}

public class Ques1 {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.setter(5, 7);
        System.out.println(obj1.method2());
        // int sum =obj1.sumMethod(obj1.getA() ,obj1.getB());
        System.out.println("The sum of 5  and 7is "+obj1.sumMethod2());
            }
}
            
