import java.io.*;
import java.util.*;

public class PFactors
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),i,flg;
		for(i=2;i<=num/2;i++)
		{
			flg=0;
			if(num%i==0)
			{
				for(int j=2;j<=i/2;j++)
				{	
					if(i%j==0)
					{
						flg=1;
						break;
					}
				}
			}
			if(flg==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}

