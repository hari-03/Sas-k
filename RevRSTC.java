import java.io.*;
import java.util.*;

public class RevRSTC
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j;
		for(i=n;i>=0;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}		

