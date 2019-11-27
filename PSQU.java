import java.io.*;
import java.util.*;
import java.lang.Math;

public class PSQU
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),n;
		double sqt;
		sqt= Math.sqrt(num);
		n= (int)sqt;
		if(n==sqt)
		{
			System.out.println(num+" is perfect square");
		}
		else
		{
			System.out.println(num+" is not perfect square");
		}
	}
}

