import java.io.*;
import java.util.*;

public class NumPttn6
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k=1,num=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print(num);
					num++;
				}
				else
				{
					System.out.print(num);
					num--;
				}
			}
			num=num+k;
			if(i%2!=0)
			{
				k=k+2;
			}
			System.out.println();
		}
	}
}
