import java.io.*;
import java.util.*;

public class Loops
{
	public static void main(String[] args)
	{ 
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		for(int j=0;j<i;j++)
		{
		
			for(int k=0;k<j;k++)
			{
				System.out.print(" * ");
			}
			for(int l=0;l<j;l++)
					System.out.println( );
			
		}
		for(int j=i;j>0;j--)
		{
		
			for(int k=j;k>0;k--)
			{
				System.out.print(" * ");
			}
			for(int l=j;l>0;l--)
					System.out.println( );
			
		}
	}
}


		 
		
