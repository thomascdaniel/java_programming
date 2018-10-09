import java.io.*;
import java.util.*;

class try1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.println("Enter Your Sentence = ");
		str = s.nextLine();
		
		int counter = 0;
		
		String answer = "",ar[]=str.split(" ");
		
		for(int i=0;i<ar.length;i++)
		{
			if(checkpal(ar[i]))
			{
				counter++;
				answer = answer + ar[i] + " ";
			}
		}
		
		System.out.println("Output = "+answer+"\n Number of pallindromes = "+counter);
	}
	
	public static boolean checkpal(String str)
	{
		char ch;
		int len = str.length(),half=len/2;
		for(int i=0;i<half;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
				return false;
		}
		return true;
	}

}

