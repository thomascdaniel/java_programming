import java.util.*;
import java.io.*;

class Worker
		{
				private String _workerName;
				private float _hours;
				private float _wage;

				public void read() throws IOException
				{
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

					System.out.println("Enter the name of the Worker");
					_workerName=br.readLine();

					System.out.println("Enter the hours");
					_hours=Float.parseFloat(br.readLine());

					System.out.println("Enter the wages of the Worker");
					_wage=Float.parseFloat(br.readLine());

				}

					public float calwg() throws IOException
					{
						return _hours * _wage;
					}

					public float extraWage() throws IOException
					{
						if(calwg()<=200)
							return 150;

						else
							return 50;
					}

					public float TotalWage() throws IOException
					{
						return calwg()+ extraWage();
					}

					public void display() throws IOException
					{
						System.out.println("Name of the worker :"+_workerName);
						System.out.println("No. Of Hours worked :"+ _hours);
						System.out.println("Wage per Hour :"+_wage);
						System.out.println("Wage of the worker :"+calwg());
						System.out.println("Extra wage :"+extraWage());
						System.out.println("Total Wage:"+TotalWage());
					}

					public static void main(String args[]) throws IOException
				{
					Worker wr= new Worker();
					wr.read();
					wr.display();
				}
		}
