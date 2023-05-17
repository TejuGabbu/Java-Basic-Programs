import java.util.Scanner;
public class arr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //      7
        int a[] = new int[n];
        int count = 0;    
        for (int i = 0 ; i<n ; i++)
        {
            a[i]= sc.nextInt();  //1 0 3 8 6 1 8 7
        }
        for (int i = 0 ; i< n ; i++)
        {
            for (int j = 0 ; j<n ; j++)
            {
                if (a[i] == a[j])
                {
                    count++;
                    
                }
            }
            
        }
        

    }
}