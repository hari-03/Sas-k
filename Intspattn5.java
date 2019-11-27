import java.io.*;
import java.util.*;

public class Intspattn5
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k,s=(2*n)-1;
		for(i=1;i<n;i++)
		{
			for(k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=s;j++)
			{
				System.out.print("*");
			}
			s-=2;
			System.out.println();
		}
		s=1;
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=s;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			s+=2;
		}
	}
}		

