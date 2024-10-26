package String;

public class st_cmp2 {
    public static void main(String [] arsh)
    {
      String s1 = "Java";
      String s2 = "java";
    
    if(s1.equals(s2))
    {
        System.out.println("Both equal");
    }
    else
    System.out.println("Not equal");

}
}
/* The reason they both are not equal is because .equals operator is case sensitive while they both are same thing. The j of java is in different cases each time. to resolve this we can use tolower function depending on the circumstances */
