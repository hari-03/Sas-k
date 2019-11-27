import java.io.*;
import java.util.*;
import java.lang.*;

public class NumPttn9
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k=0,num=1,s=1;
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
		k=2*n-1;
		for(i=1;i<n;i++)
		{
			num=num-k;
			for(j=n-i;j>=1;j--)
			{
				System.out.print(num);
				num++;
			}
			k=k-2;
			System.out.println();
		}
	}
}		

