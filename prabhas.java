import java.util.Scanner;
public class prabhas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long count = 0 ;
        while(n!=0)
        {
            long s = n%10;
            count++;
            n = n/10;
        }
        System.out.print(count);
    }
}
