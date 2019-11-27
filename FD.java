import java.io.*;
import java.util.*;

public class FD
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),rem=0,n;
		n=num;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
		}
		System.out.println("first digit is "+ rem);
	}
}
