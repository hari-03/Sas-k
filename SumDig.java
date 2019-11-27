import java.io.*;
import java.util.*;

public class SumDig
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),rem=0,sum=0,n;
		n=num;
		while(n>0)
		{
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println("Sum of digits are "+ sum);
	}
}
