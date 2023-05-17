import java.util.Scanner;
public class dublicate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //  7
        int a[] = new int[n];  //  1 5 3 5 2 6 3
        int count= 0;
        for(int i = 0; i<n ;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n ;i++) // 1 5 3 5 2 6 3
        { 
            for(int j = i+1 ; j<n ;j++)
            {
                if(a[i]==a[j])
                {
                  count= count + 1;  
                }
            }
            if(count>=1)
            {
            System.out.print(a[i] + " ");
            }
            count = 0;
        }
    }
}
//output :- 5   3