import java.util.*;
public class month
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        int spaces = 0 ;
        int numbers = 0;
        int fnumbers = 0;
        int a = 1;
        int count = 0;
        int dnumbers = 0;
        int dspaces = 0;
        int dcount = 0;
        for (int i = 1 ; i<=n ; i++)
        {
            spaces = n - i;  // 6 - 2 = 4
            numbers = n - spaces; // 6 - 4 = 2
            fnumbers = (numbers *2) - 1 ;  // (2 * 2 )- 1 = 3 
            a = 1 ;
            count = 0 ;
            for (int k = 0 ; k<spaces ; k++)
            {
                System.out.print(" ");
            }
            for (int j = 0 ; j<fnumbers ; j++)
            {
                System.out.print(a);
                count++;
                a++;
                if (a>9)
                {
                    a = 1;
                }
            }
            dcount++;
            System.out.println();
            if (count ==n)
            {
                break;
            }
        }
            for (int v = 1 ; v<=dcount-1 ;v++)
            {
                dnumbers = count - 2 ;  // 5 - 2 = 3
                dspaces = (count - dnumbers) - 1 ; //(5 - 3) - 1 = 2 - 1 =1
                int b = 1;
                for (int s = 0 ; s<dspaces ; s++)
                {
                    System.out.print(" ");
                }
                for (int p = 0 ; p<dnumbers ; p++)
                {
                    System.out.print(b);
                    b++;
                }
                System.out.println();
            }
    }
}