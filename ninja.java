// placing  numbers by a patter
//   3
//  1
// 23
//456
import java.util.Scanner;
public class ninja
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 3
        int b = 1; 
        for (int i = 1 ; i<= n ; i++)
        {
            int spaces = n - i;
            int numbers = n - spaces;
            for (int p = 1 ; p<=spaces; p++)
            {
                System.out.print(" ");
            }
            for (int k = 1 ; k<=numbers; k++)
            {
                System.out.print(b);
                b++;
                if(b>9)
                {
                    b=1;
                }
            }
            System.out.println("");
        }
    }
}
