import java.io.*;
import java.util.*;

public class ProdDig
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),rem=0,n;
		long pod=1;
		n=num;
		while(n>0)
		{
			rem=n%10;
			pod*=rem;
			n=n/10;
		}
		System.out.println("Product of digits are "+ pod);
	}
}
