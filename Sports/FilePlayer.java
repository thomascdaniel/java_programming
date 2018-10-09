//Program to implement loading ,retrieving and some processing with the record  in the 
//file
import java.io.*;
import java.util.*;

class Player implements Serializable
{
	private String playerName,item;
	private int teamId,noOfRuns,noOfOvers=20,playerId;
	private long salary;
	private double runRate;
	public int balance=10000;
    public int qty,rate,amt,total;


	public void read() throws IOException
	{
		      int n=1;

			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
	
		System.out.println("\n\t\t--------------------------------");
        System.out.println("\t\tSPORTS MANAGEMENT SYSTEM");
        System.out.println("\t\t----------------------------------");
        System.out.println("\t\t T2O LEAGUE");
        System.out.println("\n\t\t--------------------------------");

		System.out.println("Enter player name :");
		playerName=br.readLine();
		System.out.println("Enter team id :");
		teamId=Integer.parseInt(br.readLine());
		System.out.println("Enter player id :");
		playerId=Integer.parseInt(br.readLine());
		System.out.println("Enter salary :");
		salary=Long.parseLong(br.readLine());
		System.out.println("Enter runs scored in 20 overs");
		noOfRuns=Integer.parseInt(br.readLine());

		System.out.println("\t\t---------ITEMS PURCHASED----------");
        System.out.println("\t\tMAIN BALANCE : " +balance);
      System.out.println();
      do
    {
      System.out.println("----------ITEMS Purchase----------");
      System.out.println("Enter the item name  ");
      item=br.readLine();
      System.out.println("Enter the Quantity Purchased");
      qty=Integer.parseInt(br.readLine());
      System.out.println("Enter the cost of the item");
      rate=Integer.parseInt(br.readLine());
      amt=qty*rate;
      total=total+amt;

      balance =balance- amt;
      System.out.println("Any Other Item : Yes-1 or No-0");
      n=Integer.parseInt(br.readLine());
    } while(n==1); 
    runRate=noOfOvers*noOfRuns;

	
	}
	

	
	public void display()
	{
		System.out.println("Player Name :"+playerName);
		System.out.println("Team Id :"+teamId);
		System.out.println("Player Id :"+playerId);
		System.out.println("Salary :"+salary);
		System.out.println("Player Runrate : "+runRate);
		System.out.println("Total Stock Purchase is "+total);
        System.out.println("The current Balance is "+balance);
    

	}
}
class FilePlayer
{
	public static void main(String args[])
	{
		//writing object to file
		try
		{
			Player [] obj=new Player[2];
			//array of Player type , stores 2 different player detail
			FileOutputStream fileout=new FileOutputStream(new File(
				"Player"));
			//Player is name of the file

			ObjectOutputStream objout=new ObjectOutputStream(fileout);
			// to write a onject to a file so we have to use this class(ObjectOutputStream)
			//fileout is the destination file where you will store the data 
			for(int i=0;i<2;i++)
			{
				obj[i]=new Player();
				obj[i].read();
				objout.writeObject(obj[i]);

			}
			fileout.close();
			objout.close();

		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());

		}
		//reading object from file
		try
		{
			Player obj=new Player();
			//array of Player type , stores 2 different Player detail
			FileInputStream fis=new FileInputStream(new File(
				"Player"));
			//Player is name of the file, to read the data

			ObjectInputStream ois=new ObjectInputStream(fis);
			// 
			for(int i=0;i<2;i++)
			{
				try
				{
					obj=(Player)ois.readObject();
				}
				catch(Exception ex)
				{
					//System.out.println(ex.toString());

				}
				obj.display();
			}
		

			ois.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());

		}


		
		
	}

}