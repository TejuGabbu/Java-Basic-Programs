import java.util.Scanner; // table of number
public class table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //2
        for (int i = 1; i<=10 ;i++)
        {
            int b = a * i;
            System.out.print(b + " ");
        } 
    }
}