import java.util.Scanner;
public class filast
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 0;
        long b = 1;
        long c = 0;
        n = n%300;
        if (n>1) 
        {
            for (int i = 2 ; i<=n ; i++)
            {
                c = a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
        else
        {
            c= b;
        }
            // long var = c%100;
            // if (var<10)
            // {
            //     System.out.print("0" +var);
            // }
            // else
            // {
            //     System.out.print(var);
            // }
    }
}