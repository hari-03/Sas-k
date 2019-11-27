import java.io.*;
import java.util.*;

public class Perfect
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),i,sum=0;
		for(i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
			System.out.println(num+"is perfect number");
		else
			System.out.println(num+"is not perfect number");
	}
}
