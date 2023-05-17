import java.util.Scanner;
public class garibi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n)
        {
            case 1:
            System.out.print("Monday");
            break;
            
            case 2:
            System.out.print("Tuesday");
            break;
            
            case 3:
            System.out.print("Wednesday");
            break;

            default:
            System.out.print("Error");
            break;
        }
    }
}