import java.io.*;
import java.util.*;

public class GCD
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int m=a.nextInt(),n=a.nextInt(),gcd;
		gcd= (n<m)?n:m;
		while(true)
		{
			if(m%gcd==0&&n%gcd==0)
			{
				break;
			}
			gcd--;
		}
		System.out.print("GCD of "+n+" , "+m+"is "+gcd);
	}
}
