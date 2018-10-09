import java.io.*;
class Account //implements Serializable
{
	private int accno;
	private float balance;
	
	public void read()
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
			try
				{
					System.out.println("\nEnter the Account Number");
					accno=Integer.parseInt(br.readLine());
					System.out.println("\nEnter the Balance");
					balance=Float.parseFloat(br.readLine());
				}
			catch(Exception e)
				{
					System.out.println(e.toString());
				}
	}
	
	public void disp()
	{
		System.out.println("Account Number="+accno);
		System.out.println("Balance Amount="+balance);
	}
	public float getBalance()
	{
		return balance;
	}
	public void setBalance(float bal)
	{
		balance=bal;
	}
}

public class FileObject1
{
	public static void main(String args[])
{
		{//writing object to file
		try
			{
				Account[] obj=new Account[6];
				FileOutputStream fileout=new FileOutputStream("abc");
				ObjectOutputStream objout=new ObjectOutputStream(fileout);
				
				for(int i=0;i<6;i++)
					{
					obj[i]=new Account();
					obj[i].read();
					objout.writeObject(obj[i]);
					}
				objout.close();
			}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
		}
		
		/*try
		{
		Account obj=new Account();
		FileInputStream fis=new FileInputStream("abc");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
			for(int i=0; i<=6;i++)
			{
				try
				{
					obj=(Account)ois.readObject();
				}
				catch(Exception e)
				{
					
				}
				obj.disp();
				System.out.println("Hello");
			}
			ois.close();
		}
		catch(IOException ex)
		{
			
		}*/
}
}