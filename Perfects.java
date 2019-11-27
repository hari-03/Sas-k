import java.io.*;
import java.util.*;

public class Perfects
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int st=a.nextInt(),end=a.nextInt(),flg,i,j,sum=0;
		for(j=st;j<=end;j++)
		{
			sum=0;
			for(i=1;i<=j/2;i++)
			{
				if(j%i==0)
				{
					sum+=i;
				}
			}
			if(sum==j)
			{
				System.out.print(j+" ");
			}
		}
	}
}

