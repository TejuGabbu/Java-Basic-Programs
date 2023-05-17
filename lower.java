import java.util.*;
public class lower
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0 ; i<= s.length()-1 ; i++)
        {
            char c = s.charAt(i)+32;
            System.out.print(c);
        }
    }
}