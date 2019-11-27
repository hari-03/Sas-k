import java.io.*;
import java.util.*;

public class NumPttn5
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k,s=1,num=1;
		for(i=1;i<=n;i++)
		{
			
			for(k=2;k<=n+1;k++)
			{
				System.out.print(num);
				if(k>n)
				{
					System.out.print(num+1);
				}
				
			}
			System.out.println();
			num++;
		}
	}
}
