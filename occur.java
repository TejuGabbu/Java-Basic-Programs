import java.util.Scanner;
public class occur
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();     //    6
        int a[] = new int[n];    
        int temp = 0;
        int count = 1;
        for (int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();             //  5 2 5 8 2 1 
        }
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = i+1 ; j<n ;j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }                                    //    1 2 2 5 5 8
        System.out.println();
        for (int i = 0 ; i<n ; i++ )        //     1
        {
            for (int j = i+1; j<n ; j++)    //     2  5
            {
                if (a[i]==a[j])
                {
                    count++;
                }
            }
            int tejas = a[i];
            if (a[i]==tejas)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print(count + " ");
            }
            count = 1 ;
        }
    }
}