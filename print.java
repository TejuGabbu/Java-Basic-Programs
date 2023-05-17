import java.util.*;
public class print 
{
    public static void pr(int n) 
    {
        // 3
        if(n==0)
        {
            return;
        }   
        System.out.println("Hello World");
        pr(n-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        pr(n);    
    }    
}
