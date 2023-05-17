// program is to delete an element in an array
import java.util.Scanner;
public class del
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 5
        int x = sc.nextInt();  // 2 3 4 5 9 
        int a[] = new int[n];
        for (int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0 ; i<x ; i++) 
        {
            System.out.print(a[i]+" ");
        }
        for (int i = x+1 ; i<n ; i++) 
        {
            System.out.print(a[i]+" ");
        }
    }
}