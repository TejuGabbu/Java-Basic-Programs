// program is to print a space after every digit 
import java.util.Scanner;
public class number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 548624
        int a[] = new int[6];
        int i = 0;
        while (n!=0)
        {
            int p = n%10;
            while(n!=0)
            {
                a[i] = p;
                i++;
                break;
            }
            n = n/10;
        }
        for (i = 5 ; i>=0 ; i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}