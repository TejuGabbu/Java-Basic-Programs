import java.util.Scanner;
public class inta
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0)
        {
            int p = n%10;
            sum = sum + p;
            n = n/10;
        }
        int m = sum; // 
        // System.out.print(m);
        int fsum = 0;
        while (m!=0)
        {
            int s = m%10;
            fsum = fsum + s;
            m = m/10;
        }
        System.out.print(fsum);
    }
}