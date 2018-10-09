import java.io.*;
import java.util.*;
public class names1 
{
 public static void main(String[] argv) throws Exception 
 {
	int i=0;
    FileWriter fw = new FileWriter("file.txt");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	int a=1;
	int x=0;
	System.out.println("\nenter number of names\n");
		x=Integer.parseInt(br.readLine());
	while(a>0&&a<=2)
	{
	System.out.println("Enter option");
	System.out.println("1)Enter names");
	System.out.println("2)display names");
	System.out.println("3)Exit");
	a=Integer.parseInt(br.readLine());
		if(a==1)
		{
		String nam[]=new String[x];	
		System.out.println("\nenter names\n");
	for(i=0;i<x;i++)
	{
	nam[i]=br.readLine();
	//if(i!=x-1)
	//{
		fw.write(nam[i]+"\n");
	//fw.write(System.lineSeparator()); //new line
	//}
	//else
		//fw.write(nam[i]+"\n");
	}
	fw.close();
		i=0;
		}
		else if(a==2)
		{
		try {
			File f = new File("file.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br2 = new BufferedReader(fr);
			String nam2[]=new String[x];
			String line;
			for(i=0;(line = br2.readLine()) != null;i++) 
			{
				nam2[i]=line;
			}
			fr.close();
			 Arrays.sort(nam2);
	    for(i = 0; i < nam2.length; i++)
        	{
			System.out.println(nam2[i]);
            }	
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		}
		if(a==3)
			break;
		}
		}

	
}