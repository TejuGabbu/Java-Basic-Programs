// smallest number in array which is divisible by 5
import java.util.Scanner;
public class pitttu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //  5
        int a[] = new int[n]; // 3 13 40 35  50
        int p[] = new int[n];
        int count = 0;
        for(int i = 0 ; i<n ;i++)
        {
            a[i] = sc.nextInt();
        }
        int j = 0;
        for(int i = 0 ; i<n ;i++)
        {
            if(a[i]%5==0)
            {
                p[j] = a[i];
                j++;
                count++;
            }
        }
        int small = p[0];
        for(j= 0 ; j < count ;j++)   // 40 35 50
        {
            if(small>p[j])
            {
                small=p[j];
            }
        }
        System.out.println(small);
    }
}