import java.io.*;
import java.util.*;

public class Intspattn2
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
			for(k=1;k<=(2*(n-i));k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
					System.out.print("*");
			}
			System.out.println();
		}
	}
}		

