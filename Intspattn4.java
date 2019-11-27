import java.io.*;
import java.util.*;
import java.lang.*;

public class Intspattn4
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k,s=1;
		for(i=1;i<=2*n-1;i++)
		{
			for(j=1;j<=s;j++)
			{
				System.out.print("*");
			}
			for(k=1;k<=2*(Math.abs(n-i))-1;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=s;j++)
			{
				if(j!=n)
					System.out.print("*");
			}
			System.out.println();
			if(i<n)
			{
				s+=1;
			}
			else
			{
				s-=1;
			}
		}
	}
}		

