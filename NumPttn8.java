import java.io.*;
import java.util.*;
import java.lang.*;

public class NumPttn8
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k,s=1;
		for(i=1;i<=2*n-1;i++)
		{
			
			for(j=1;j<=s;j++)
			{
				System.out.print(s);
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

