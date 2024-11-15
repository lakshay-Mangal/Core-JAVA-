class A{
    int a;
 
    void setter(int a)
    {
        this.a=a;
    }

    int getter()
    {
        return a;
    }
}

public class GetterandSetter {
    public static void main(String[] args) {
        A p = new A();
        p.setter(56);
        System.out.println(p.getter());
        
    }
}
