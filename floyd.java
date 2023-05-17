import java.util.Scanner;
public class floyd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1 ; i<= n ; i++)
        {
            int spaces = n - i;
            int numbers = n - spaces;
            for (int j = 1 ; j<= numbers ; j++)
            {
               System.out.print(a+" ");
               a++;
            }
            for (int k = 1 ; k<= spaces ; k++)
            {
               System.out.print(" ");
            }
            System.out.println();
        }
    }
}