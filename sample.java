// import java.util.Scanner;
// public class sample
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         long n = sc.nextInt();
        long a[] = new long[100];
        int i = 0;
        long p = 0;
        while(n!=0)
        {
            p = n%10;
            while (n!=0)
            {
                a[i] = p;
                break;
            }
            i++;
            n = n/10;
        }
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}