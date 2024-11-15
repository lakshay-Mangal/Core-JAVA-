class Shows{

    void show1() {
        System.out.println("This is show 1 method");
    }
    void show2(String name) {
        System.out.println("This is show 2 method "+name);
    }
}

class Shows2 extends Shows{
    String show3 () {
        String x = "This is show 3 method ";
        return x;
    }
    String show4 (String name) {
        String x = "This is show 3 method "+name;
        return x;
    }
    Shows2 show5(){
        System.out.println("covariant class");
        return this;

    }
}


public class Single{
    public static void main(String[] args) {
        Shows2 p =new Shows2();
        p. show1();
        p.show2("lakshay");
       System.out.println(p.show3()); 
        System.out.println(p.show4("lakshay"));
        p.show5();
    }
}