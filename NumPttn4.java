import java.io.*;
import java.util.*;

public class NumPttn4
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k,s=1;
		for(i=1;i<=n;i++)
		{
			int num=1;
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=s;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
			s+=2;
		}
	}
}		

