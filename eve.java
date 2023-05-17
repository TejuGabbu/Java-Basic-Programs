import java.util.Scanner;
public class eve
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 1 ;  ; i++)
        {
            int n =sc.nextInt();
            if(n%2!=0)
            {
                count++;
                System.out.print(i);
            }
            if(count>=1)
            {
                break;
            } 
        }
    }
}