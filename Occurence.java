import java.io.*;
import java.util.*;

public class Occurence
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),dig=a.nextInt(),rem=0,flg=0,n;
		n=num;
		while(n>0)
		{
			rem=n%10;
			if(rem==dig)
			{
				flg=1;
				break;
			}
			n=n/10;
		}
		if(flg==1)
			System.out.println(dig+" is occured in "+num);
		else
			System.out.println(dig+" is not occured in "+num);
	}
}
