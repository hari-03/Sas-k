import java.io.*;
import java.util.*;

public class Palindrome
{
	public static void main(String[] args)
	{ 
		Scanner a= new Scanner(System.in);
		int num=a.nextInt(),rem=0,rev=0,n;
		n=num;
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(num==rev)
			System.out.println("Palindrome");
		else
			System.out.println(" Not Palindrome");
	}
}
