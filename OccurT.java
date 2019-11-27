import java.io.*;
import java.util.*;

public class OccurT
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),dig=a.nextInt(),rem=0,sum=0,n;
		n=num;
		while(n>0)
		{
			rem=n%10;
			if(rem==dig)
			{
				sum+=1;
			}
			n=n/10;
		}
		System.out.println(dig+" is occured in "+num+" for "+ sum+" times");
	}
}
