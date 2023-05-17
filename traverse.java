/// diagonal traverse of array
import java.util.Scanner;
public class traverse
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int t = n;
			int a[][] = new int[n][n];
			for(int i = 0 ; i<n ; i++)
				{
					for(int j = 0 ; j<n ; j++)
						{
							a[i][j] = sc.nextInt();
						}
				}
			int i = 0; // 0
			int j = n-1; //4
			int z = 1;
			int count = 0;
			int flag = 0 ;
			int f = n-1;//4
			int tejas = 0;
			int x = n - 1; //4
			int p = x; //4
			while (i<t && j<t )
			{
					   for(int k = 1 ; k<=z ; k++) //z=4
						{
							System.out.print(a[i][p]+" ");
							if(count==0)
							{
								break;
							}
							if(i>=0 && i<t) // t==5
							{
								i++; //4
								p++; //5
								if(p==n) // 5 ==5
								{
									break;
								}
							}
						}
				tejas++;// 4
				if(tejas==f) //4 == 4
				{
					break;
				}
				count++;//3
				z++;//4
				i = 0;
				x--;//1
				p = x;//1

			}
			int tp = n;
			i = 0;
			p = 0;
			j = n-1;
			z++;//4
			flag = 0;
			f = 0;
			int bata = 0;
			while (i<tp && j<tp)
			{
				for(int k = 1 ; k<=z ; k++ ) //3
				{
					System.out.print(a[i][p]+" ");
					i++; //4
					p++;//4
					if(p == n) //  == 4
					{
						break;
					}
				}
				bata++;
				if(bata==tp)
				{
					break;
				}
				f++; //1
				i = f ; // 1
				p = 0; //
				z--;//3
				n--; //3
			}
		}
	}