import java.io.*;
import java.util.*;

public class Intspattn3
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(k=1;k<=(2*(n-i)-1);k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(j!=n)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}		

