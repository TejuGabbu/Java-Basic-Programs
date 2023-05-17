import java.util.Scanner;
public class num
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 3
        int a = 1;
        int spaces = 0 ;
        int numbers = 0;
        int b = 0;
        for (int i = 1 ; i<=n ; i++)
        {
            spaces = n - i; // 3-1 = 2
            numbers = n - spaces ; // 3-2 = 2
            b = i;
            for (int j = 0 ; j<numbers ; j++)
            {
                System.out.print(b);
                b++; // 4
            }
            System.out.println();
        }
    }
}
