// print natural numbers according to user input 
import java.util.Scanner;
public class task
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++) //i = i+1;(i++)    
        {
            System.out.print(i + " ");
        }
    }
}