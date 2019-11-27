import java.io.*;
import java.util.*;

public class Factors
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),i;
		for(i=1;i<=num/2;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
		}
	}
}

