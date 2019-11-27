import java.io.*;
import java.util.*;

public class NumPttn7
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k,s=1;
		int num=1;
		for(i=1;i<=n;i++)
		{
			
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=s;j++)
			{
				System.out.print(num);
				
			}
			System.out.println();
			num++;
			s+=2;
		}
	}
}		

