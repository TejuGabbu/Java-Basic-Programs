// program is to print unique elements in arrray
import java.util.Scanner;
public class unique
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();          //       7
        int a[] = new int [n];        //  1 3 2 1 5 3 2
        for (int i = 0 ; i<n ; i++)                             
        {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = 0 ; j<n ; j++)       
            {
                if (a[i] == a[j])
                {
                    count++; 
                }
            }
            if(count==1)
            {
                System.out.print(a[i]+" ");
            }
            count = 0;
        }
    }
}
// unique 5 to print on screen