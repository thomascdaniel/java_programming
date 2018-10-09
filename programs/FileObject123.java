import java.io.*;
class Account implements Serializable
{
	public String empName;
	public int basicSalary;
	private int accno;
	float hra;
	public float balance;
	float totalSalary;
	public void read(float hra,int totalSalary) 
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
			try
				{
					System.out.println("Enter the Name of the Employee");
					empName=br.readLine();
					System.out.println("\nEnter the Account Number");
					accno=Integer.parseInt(br.readLine());
					System.out.println("Enter the salary");
					basicSalary=Integer.parseInt(br.readLine());
					this.hra=hra;
					this.totalSalary=totalSalary;
					
				}
			catch(Exception e)
				{
					System.out.println(e.toString());
				}
	}
	public void totSalary()
	{
		hra=(float)9.5;
		totalSalary=basicSalary*hra;
	}
	public void disp()
	{
		System.out.println(empName+"\t\t\t"+accno+"\t\t\t"+basicSalary+"\t\t\t"+hra+"\t\t\t"+totalSalary);
	}
	
}

public class FileObject123
{
	public static void main(String args[])
{
		{//writing object to file
		try
			{
				Account[] obj=new Account[2];
				FileOutputStream fileout=new FileOutputStream("abc.txt");
				ObjectOutputStream objout=new ObjectOutputStream(fileout);
				
				for(int i=0;i<2;i++)
					{
					obj[i]=new Account();
					obj[i].read(0,0);
					objout.writeObject(obj[i]);
					}
				objout.close();
			}
		catch(Exception ex)
			{
				System.out.println(ex.toString());
			}
		
		}
		
		try
		{
		Account obj=new Account();
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		System.out.println("\nName\t\tAccount Number\t\tBasic Salary\t\tHRA\t\tTotal Salary");
			for(int i=0; i<2;i++)
			{
				try
				{
					obj=(Account)ois.readObject();
				}
				catch(Exception e)
				{
					
				}
				
				obj.totSalary();
				obj.disp();
				
			}
			ois.close();
		}
		catch(IOException ex)
		{
			
		}
}
}