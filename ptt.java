import java.util.Scanner;
public class ptt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 4
        int s = n ; // 4
        int z = n+1;
        int spaces = 0 ;
        int numbers = 1;
        for (int i = 1 ; i<=z; i++) //  i = 2
        {
            spaces = n + 1;  // 4 + 1 = 5                 5
            for (int j = 0 ; j<spaces ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0 ; k<numbers ; k++)
            {
                System.out.print(" "+"*");
            }
            System.out.println();
            n--; // 3
            numbers++; // 3
        }
        // 4 stars and 1 spaces
        int dspaces = 1;  
        int dstar = s;   // s = 4
        for (int a = 1 ; a<=s; a++)
        {
            System.out.print(" ");
            for (int b = 0 ; b<dspaces ; b++)
            {
                System.out.print(" ");
            }
            for (int c = 0 ; c<dstar ; c++)
            {
                System.out.print(" "+"*");
            }
            System.out.println();
            dstar--;
            dspaces++;
        }
    }
}