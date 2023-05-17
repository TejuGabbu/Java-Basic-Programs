import java.util.*;
public class sort
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a[]= {5, 4 , 3 , 2, 1};
        sc.close();

        // bubble sort algorithm
        // for(int i = 0 ; i<a.length ; i++)
        // {
        //     for(int j = i+1 ; j<a.length ; j++)
        //     {
        //         if(a[i]>a[j])
        //         {
        //             int temp = a[i];
        //             a[i] = a[j];
        //             a[j] = temp;
        //         }
        //     }
        // }


        // selection sort algorithm
        // for(int i = 0 ; i<a.length; i++)
        // {
        //     int min = i;
        //     for(int j = i+1 ; j<a.length ; j++)
        //     {
        //         if(a[min]>a[j])
        //         {
        //             min = j;
        //         }
        //     }
        //     int temp = a[i];
        //     a[i] = a[min];
        //     a[min] = temp;
        // }

        // insertion sort algorithm
        // for(int i = 0 ; i<a.length ; i++)
        // {
        //     int key = a[i];
        //     int j = i-1;
        //     while(j>=0 && key<=a[j])
        //     {
        //         a[j+1] = a[j];
        //         j--;
        //     }
        //     a[j+1] = key;
        // }
        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}