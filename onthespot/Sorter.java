import java.util.*;

import java.io.*;

class Sorter
	{
	public int arr[]=new int[100];
	public int size, i ,temp=0;
	
		void readList() throws IOException
		{
			int i=0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("***********Enter the value to be display************");
			size=Integer.parseInt(br.readLine());
			
			
			System.out.println("****Enter the number****");
				for (i=0;i<size;i++)
					{
						arr[i]=Integer.parseInt(br.readLine());
					}
			
		}
		void displayList()
		{
			int i=0;
			System.out.println("Ascending Order");
				for(i=0;i<size;i++)
					{
						System.out.println(arr[i]);
					}
		}
		void sort()
		{
			for(int i=0;i<size;++i)
			{
				for(int j=i+1;j<size;++j)
					{
						if(arr[i]>arr[j])
							temp = arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
					}
			}
		}
		
		public static void main(String args[]) throws IOException 
		{
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br= new BufferedReader(isr);
			
			Sorter s= new Sorter();
			s.readList();
			s.sort();
			s.displayList();
			
		}
	}