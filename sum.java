import java.util.*;
public class sum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i<n ; i++)    
        {
            a[i] = sc.nextInt();
        }
        sc.close();
        int res = f(a,0,n);
        System.out.println(res);
    }
    public static int f(int a[] , int i , int n)
    {
        // base condition
        if(i==n)
        {
            return 0;
        }
        return a[i] + f(a, i+1, n);
    }
}
