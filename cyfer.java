import java.util.Scanner;
public class cyfer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  //TEJAS
        int n = s.length();    //
        int p;     //  5
        char a[] = new char [n];
        for (int i = 0 ; i< n ; i++ )
        {
            a[i] = s.charAt(0);
        }
        int first = a[0];    // T
        for (int i = 0 ;i<n ; i++)
        {
            p = s.charAt(i) - 65 ;
            System.out.print(p);
        }
    }
}