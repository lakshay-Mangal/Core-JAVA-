

class GetterSetter {
    private String b;
    private  String a;
    
        void set_data(String a, String b){
            this.a =a;
            this.b = b;
    }
    String getA(){
        return a;
    }
    String getB() {
        return b;
    }
    
    
}
class B extends  GetterSetter{
    
    void printline() {
        System.out.println(getA());
        System.out.println(getB());

    }

}
public class GetSet {
    public static void main(String[] args) {
        B obj1 = new B();
        B obj2 = new B();
        B obj3 = new B();
        B obj4 = new B();

        obj1.set_data("Hello world", "I am Lakshay Mangal");
        obj2.set_data("This is ", "2nd instance of class");
        obj3.set_data("3rd", "Object");
        obj4.set_data("4th", "Object");
        obj1.printline();
        obj2.printline();
        obj3.printline();
        obj4.printline();
    }
}
