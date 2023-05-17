import java.util.Scanner;
public class day
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // month
        int n = sc.nextInt(); // year
        if (n%100==0 && n%400==0 || n%4==0 && n%100!=0) // means leap year
        {
            if (a==2)
            {
                System.out.print("29 days");
            }
            else if (a==1||a==3||a==5||a==7||a==8||a==10||a==12)
            {
                System.out.print("31 days");
            }
            else 
            {
                System.out.print("30 days");
            }
        }
        else
        {
            if(a==1||a==3||a==5||a==7||a==8||a==10||a==12)
            {
                System.out.print("31 days");
            }
            else if(a==2)
            {
                System.out.print("28 days");

            }
            else 
            {
                System.out.print("30 days");
            }
        }
    }
}