import java.util.Scanner;
public class fibo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int a = 0;     
        int b = 1;
        if (n==1)
        {
            System.out.println(a);
        }
        else if (n==2)
        {
            System.out.println(a);
            System.out.println(b);
        }
        else
        {
            a = 0;
            b = 1;
            System.out.println(a);
            System.out.println(b);
            for (int i = 1 ; i<= n-2 ; i++)
            {
                while (i<=n)
                {
                    int c = a+b;
                    int f = c ;
                    System.out.println(f+" ");
                    a = b;
                    b = f;
                    break;
                }
            }
        }
    }
}
// 0 1 1