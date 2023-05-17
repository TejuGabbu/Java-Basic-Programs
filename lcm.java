import java.util.Scanner;
public class lcm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   //10
        int b = sc.nextInt();
        int num;   //15
        for (int i =1 ; i<=a ; i++)
        {
            if(a%i==0)
            {
                System.out.print(i + " ");
            }
        } 
        System.out.println();
        for (int i =1 ; i<=b ; i++)
        {
            if(b%i==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}