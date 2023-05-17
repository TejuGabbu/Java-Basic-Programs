import java.util.Scanner;
public class star
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 3
        for (int i = 1 ; i<= n ; i++)
        {
            int spaces = n - i;  
            int stars = n - spaces;
            for (int p = 1 ; p<=stars; p++)
            {
                System.out.print("*");
            }
            for (int k = 1 ; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            System.out.println("");    
        }
    }
}