import java.io.*;
import java.util.*;

public class RevPyrmd
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k,s=(2*n)+1;
		for(i=n;i>=0;i--)
		{
			for(k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(j=s;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			s-=2;
		}
	}
}		

