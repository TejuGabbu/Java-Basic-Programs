import java.util.Scanner;
public class cone
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 6
        int z = sc.nextInt(); // 3
        int a[] = new int[n]; //  4 3 1 2 1 2 
        for (int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int j = 0 ; j<n ; j++)
        {
            for (int k = j+1 ; k<n ; k++)
            {
                sum = a[j] + a[k];
                if (z==sum)
                {
                    count++; // 2
                }
                break;
            }
        }
        System.out.print(count);
    }
}