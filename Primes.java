import java.io.*;
import java.util.*;

public class Primes
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int st=a.nextInt(),end=a.nextInt(),flg,i,j;
		for(j=st;j<=end;j++)
		{
			flg=0;
			for(i=2; i<=j/2;i++)
			{
				if(j%i==0)
				{
					flg=1;
					break;
				}
			}
			if(flg==0)
			{
				System.out.print(j+" ");
			}
		}
	}
}
					
