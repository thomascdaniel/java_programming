import java.util.*;
import java.io.*;

class Myarray 
	{
	public int arr[];
	public int n;
	
		Myarray(int a)
		{
		arr= new int [a];	
		n=a;
		}
		
		void readArray() throws IOException
		{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			{	
				arr[i]=Integer.parseInt(br.readLine());
				//System.out.println(i);
			}
		}
		
		void displayarray()	
		{
			System.out.println("The array to be displayed");
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("Sum"+sum());
		}
		
		int highestnumber()	
		{
		int max=arr[0];
			
		for(int i=0;i<n;i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			}
		return(max);
		}
		int sum()
		{
			int max=highestnumber();
			int s_max=arr[0];
			
			
			for(int i=1;i<n;i++)
			{
				if(arr[i]>s_max && arr[i]!=max)
				{
					s_max=arr[i];
				}
			}
			return (max+s_max);
		}
		
	public static void main(String args[]) throws IOException
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			int m;
			System.out.println("Enter the size of the array");
			m=Integer.parseInt(br.readLine());
			Myarray a=new Myarray(m);
			a.readArray();
			a.displayarray();
			int b= a.highestnumber();
			System.out.println("highest number is"+b);
			
		}
	}