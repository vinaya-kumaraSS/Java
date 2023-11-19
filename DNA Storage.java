/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n;
		String s;
		int T=sc.nextInt();
		while(T-->0)
		{
		    n=sc.nextInt();
		    s=sc.next();
		    for(int i=0;i<s.length();i=i+2)
		    {
		        if ((s.charAt(i) == '0') && (s.charAt(i + 1) == '0')) {
                    System.out.print("A");
                }
                if ((s.charAt(i) == '0') && (s.charAt(i + 1) == '1')) {
                    System.out.print("T");
                }
                if ((s.charAt(i) == '1') && (s.charAt(i + 1) == '0')) {
                    System.out.print("C");
                }
                if ((s.charAt(i) == '1') && (s.charAt(i + 1) == '1')) {
                    System.out.print("G");
                }
		    }
		    System.out.println();
		}
	}
}
