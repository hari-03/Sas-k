import java.io.*;
import java.util.*;

public class Armstrong
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),rem=0,count=0,n,amg=0,pod=1,m;
		n=num;
		while(n!=0)
		{
			n=n/10;
			count=count+1;
		}
		m=num;
		while(m!=0)
		{
			rem=m%10;
			pod=1;
			for(int i=1;i<=count;i++)
			{
				pod*=rem;
			}
			amg+=pod;
			m/=10;
		}
		if(amg==num)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}
