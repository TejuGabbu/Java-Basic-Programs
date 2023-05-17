import java.util.Scanner;
public class fun
{
    public static int add(int a , int b)
    {
        int hcf = 1;
        for (int i = 1 ; i<=a && i<=b ; i++)
        {
            if (a%i==0 && b%i==0)
            {
                return 1;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(add(a,b)); // function call 
    }
}