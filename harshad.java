import java.util.Scanner;
public class harshad
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while (n!=0)
        {
            int p = n%10;
            sum = sum + p;
            n = n/10;
        }
        // System.out.print(sum);
        if (m%sum==0)
        {
            System.out.print("Harshad Number");
        }
        else
        {
            System.out.print("Not a Harshad Number");
        }
    }
}