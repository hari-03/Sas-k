import java.io.*;
import java.util.*;

public class PrimeorNot
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),i;
		for(i=2; i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println(num+"Not a prime");
				break;
			}
			else
				System.out.println(num+"Is a prime");
		}
	}
}
