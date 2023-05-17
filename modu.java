import java.util.Scanner;
public class modu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10000];
        int n = sc.nextInt();  // 10
        int e = sc.nextInt();  // 3
        int p = 0;
        int j = 0;
        for (int i = 1 ; i<=10000000; i++)
        {
            p = e * i;
            int s = n - p ;
            if (s>=0)
            {
                a[j] = s;
                j++;
            }
        }
        int low = a[0]; 
        for (int i = 1 ; i<j ; i++)
        {
            if (low>a[i])
            {
                low = a[i];
            }
        }
        System.out.print(low);
    }
}