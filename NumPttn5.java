import java.io.*;
import java.util.*;

public class NumPttn5
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int n=a.nextInt(),i,j,k,s=1,num=1;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.print(num+1);
			for(k=2;k<=n+1;k++)
			{
				System.out.print(num);
				
			}
			if(i%2!=0)
			{
				System.out.print(num+1);
			}
			System.out.println();
			num++;
		}
	}
}
