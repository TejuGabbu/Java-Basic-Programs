import java.util.*;
public class funny 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String f = "";
    for(int i = 0 ; i<s1.length() ; i++)
    {
      f = f.concat(s1.charAt(i)+""); //et 
    }
    System.out.print(f);//
    // String s2 = sc.next();
    // if(s1.equalsIgnoreCase(s2))
    // {
    // 	System.out.println("equal");
    // }
    // else
    // {
    // 	System.out.println("not equal");
    // }
    // if(s1.contains(s2))
    // {
    // 	System.out.println("present");
    // }
    // else
    // {
    // 	System.out.println("not present");
    // }
  }
}
