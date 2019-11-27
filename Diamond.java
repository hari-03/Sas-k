import java.io.*;
import java.util.*;
import java.lang.*;

public class Diamond
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k,s=1;
		for(i=1;i<=2*n-1;i++)
		{
			for(k=1;k<=Math.abs(n-i);k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=s;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<n)
			{
				s+=2;
			}
			else
			{
				s-=2;
			}
		}
	}
}		

