import java.util.Scanner;
public class pronic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 20
        int a = 1;
        int b = 2;
        int count = 0 ;
        while (a<=n && b<=n && n!=0)
        {
            if (a*b==n)
            {
                System.out.print("Pronic Number");
                count++;
                break;
            }
            a = b;
            b = b+1;
        }
        if (count==0)
        {
            System.out.print("Not a Pronic Number");
        }
    }
}