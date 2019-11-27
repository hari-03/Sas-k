import java.io.*;
import java.util.*;

public class POF2
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),n,flg;
		n=num;
		flg=0;
		while(n>1)
		{
			if(n%2!=0)
			{
				flg=1;	
				break;
			}
			n=n/2;
		}
		if(flg==0)
		{
			System.out.println(num+"is a power of 2");
		}
		else
			System.out.println(num+"is not a power of 2");
	}
}
