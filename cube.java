import java.util.Scanner;
public class cube
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int m = n;
        int mul = 1;
        int count = 0;
        for (int i = 1 ; i<=n ; i++)  
        {
            for (int j = 1 ; j<=3 ; j++)
            {
                mul = mul * i ;   
            }
            if (mul==n)
            {
                System.out.println("it is a cube");
            }
            else 
            {
                count++;
            }
            mul = 1;
        }
        if (count == m)
        {
            System.out.println("it is not a cube");
        }
    }
}