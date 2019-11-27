import java.io.*;
import java.util.*;

public class RevLSTC
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k;
		for(i=n;i>=0;i--)
		{
			for(k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(j=i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}		

