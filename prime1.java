/* package whatever; // don't place package name! */

 
import java.lang.*;
import java.io.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class prime1
{

	public static void main (String[] args) throws java.lang.Exception
	{
	    int i,c=0;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		if(n% i ==0)
		{
			c++;
			
		}
	}
	        if(c==2)
	        {
	        	System.out.println("yes");
	        }
	        else
	        {
	        	 System.out.println("no");
	        }
	}
}

	        
	        
