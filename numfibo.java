// addition of  number fibonacci of a number
import java.util.Scanner;
public class numfibo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 3
        int a = sc.nextInt();   // 123
        int f[] = new int[n];
        int fact = 1;
        int sum = 0;
        int i = 0;
        while(i<n)
        {
            int l = a%10;
            f[i]=l;
            for(int j = 1 ; j<=f[i]; j++)
            {
                fact = fact * j;
            }
            sum = sum + fact;
            fact = 1;
            // System.out.println(f[i]);
            a = a /10;
            i++;
        }
        System.out.println(sum);
    }
}