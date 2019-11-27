import java.io.*;
import java.util.*;

public class CD
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),sum=0,n;
		n=num;
		while(n>0)
		{
			sum++;
			n=n/10;
		}
		System.out.println("Count of digits in "+ num+" is" + sum);
	}
}
