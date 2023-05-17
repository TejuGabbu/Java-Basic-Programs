import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(); // 5834
        long count = 0 ;
        while(n!=0)
        {
            long s = n%10;   //for length of number
            count++;
            n = n/10;
        }
        long i = count - (count-1);
        long p = i* -----;  // missing
        System.out.print(p);
        // long sum = 0;
        // while (n!=0)
        // {
        //     long a = n%10;
        //     while(i<)
        //     {
        //         a = a*i;
        //         sum = sum + a;
        //         break;
        //     }
        //     i=i/10;
        //     n = n/10;
        // }
        // System.out.print(sum);
    }
}