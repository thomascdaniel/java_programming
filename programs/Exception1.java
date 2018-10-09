import java.io*;
class Employee
	{
	String eName;
	byte age;
	void read() //throwe IOException
		{
		try 
			{
			BufferedReader br new= BufferedReader(new InputStreamReader(System.in));
			
			System.out.printl("Enter the Employee Name");
			eName=br.readLine();
			
			System.out.println("Enter the Employee age");
			age=Byte.parseByte(br.readLine());
			}
			
			catch(IOException e1)
			{
			System.out.println("The exception generated" +e1);
			}
			
			catch(NumberFormatException e1)
			{
			System.out.println("The exception generated" +e1);
			}
			
			finally
			{
				System.out.println("Inside final block");
			}
		}
	}
	
public class Exception1
{
	public static void main(String [] s1) //throws IOException
	{
		Employee obj=new Employee();
		//try
		obj.read();
		//catch(IOException e1)
		
		Employee o2;
		//int a=10;
		o2=obj;
		o2.read();
	}
}