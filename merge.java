import java.util.*;
public class merge
{
    public static void mer(int a[] , int l , int mid , int r)
    {
        int n1 = (mid-l)+1; // 2 - 0 + 1 = 3
        int n2 = r-mid; // 4 - 2 = 2

        
        int a1[] = new int[n1] ; //3 length array
        int a2[] = new int[n2] ; //3 length array

        int k = 0;
        // firs@t array copy
        for(int i = l ; i<=mid ; i++) // 
        {
            a1[k] = a[i];
            k++; 
        }
        k = 0;
        //second array copy
        for(int i = mid+1 ; i<=r ; i++)
        {
            a2[k] = a[i];
            k++; 
        }
        
        int index1 = 0;
        int index2 = 0;
        k = l;
        while(index1<n1 && index2<n2)
        {
            if(a1[index1]<a2[index2])
            {
                a[k] = a1[index1];
                index1++;
            }
            else
            {
                a[k] = a2[index2];
                index2++;
            }
            k++;
        }
        while(index1<n1)
        {
            a[k] = a1[index1];
            index1++;
            k++;
        }
        while(index2<n2)
        {
            a[k] = a2[index2];
            index2++;
            k++;
        }
        return;
    }
    public static void mergesort(int a[] , int l , int r)
    {
        if(l==r)
        {
            return;
        }
        int mid = (l+r)/2;
        mergesort(a, l, mid);
        mergesort(a,mid+1,r);
        mer(a,l,mid,r);
        return;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();
        mergesort(a,0,a.length-1);
        for(int i = 0 ; i<n ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}