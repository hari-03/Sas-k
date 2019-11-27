import java.io.*;
import java.util.*;

public class LCM
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int m=a.nextInt(),n=a.nextInt(),lcm;
		lcm= (n>m)?n:m;
		while(true)
		{
			if(m%lcm==0&&n%lcm==0)
			{
				break;
			}
			lcm--;
		}
		System.out.print("LCM of "+n+" , "+m+"is "+lcm);
	}
}
