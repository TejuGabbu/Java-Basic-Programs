// program to check the user's number is power of 2
import java.util.Scanner;
public class samplepower
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();  // 16
        long p = 0; 
        long count = 0;  
        System.out.print((2^n)+2);
        if (n==1)
        {
            System.out.print("true");
        }        
        else
        {
            for (int i = 1 ; i<=10000 ; i++)
             {
                p = 2 * i;
                if (p==n)
                {
                    System.out.print("true");
                    count++;
                    break;
                }
            }
        }    
        if (count == 0 && n!=1)
        {
            System.out.print("false");
        }
    }
}