import java.io.*;// Bufferreaderclass
import java.util.*;//Scannerclass


class Customer
	{
		private String custName; // only within the class parent class or sun class (public)
		private byte custAge; // byte is used in place of int because it uses less space
		private long accNo;
		private char gender;
		private short minBal;	
		private float balance;

			
			
		//public Customer(String a, byte a1) 
		//public Customer(String b, byte b1)
		// Constructor 6/6/2017 It ia function. Name should be same of class and constructor. No return type.. It  should be public. 
		// Contructor Overloading: - Same name but parameters are different
		public Customer()
		{
			System.out.println("Hello");
			custName="a";
			custAge=23;
			accNo=473383;
			gender='F';
			minBal=838;
			balance=42882;
		}
	
	
	public void read() throws IOException
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in/*Its for the keyboard input*/));
				//java.io.BufferedReader br= new java.io.BufferedReader(isr);// Without using the import file we can use this instead of import statement
				/*  				OR
					InputStreamReader isr=new InputStreamReader(System.in);
					BufferedReader br=new BufferedReader(isr);
				*/
				
				/*Scanner sc=new Scanner(System.in)*/	
				
				System.out.println("Enter the Customer Name:");
				custName=br.readLine();
				
				System.out.println("Enter the age of the customer");
				custAge=Byte.parseByte(br.readLine());
				
				System.out.println("Enter the customer Account no");
				accNo=Long.parseLong(br.readLine());
				
				System.out.println("Enter the customer's minimun balance:");
				minBal=Short.parseShort(br.readLine());
				
				System.out.println("Enter the customer's Balance");
				balance=Float.parseFloat(br.readLine());
				/*                 OR
				balance=Float.valueOf(br.readLine()).floatValue();
				*/

				System.out.println("Enter whether Male 'M' to Female 'F'");
				gender=(char)br.read(); // External casting
			}
			
		public void display()
			{
				System.out.println("Customer's Name:"+custName);
				System.out.println("Customer's Age:"+custAge);
				System.out.println("Customer's Account:"+accNo);
				System.out.println("Customer's Min Bal:"+minBal);
				System.out.println("Customer's Main Balance:"+balance);
			}
	byte search(String name) // search funtion is for name FUNCTION OVERLOADING
			{
				if(custName.equals(name))
						return 1;
				else
						return 0;
			}
		
		byte search(long acno) // search function for Account Number FUNCTION OVERLOADING
			{
				if(accNo==acno)
						return 1;
				else 
						return 0;
			}
		byte search(float balance, char gender) // search function for balance and gender FUNCTION OVERLOADING
			{
				if(balance>=balance && gender== gender)
						return 1;
				else 
						return 0;
			}
	}
		
class CommandLine
			{
				public static/*Directly call by the class name*/ void/*Not returning any value*/ main(String args[]) throws IOException
				{
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					boolean ch=true;
					byte res, res1,b1=0;
					
					
					
					//Customer ob1=new Customer("s", 22); //Constructor Overloading
					
					
					//ob1.display();
					Customer ob1=new Customer();
					Customer obj[]= new Customer[2];
					
					while(ch)
						{
							System.out.println("1. Read Data");
							System.out.println("2. Display Data");
							System.out.println("3. Search");
							System.out.println("4. Exit" );
							System.out.println("Enter the choice" );
							res=Byte.parseByte(br.readLine());
							
							switch(res)
									{
										case 1:
												for(byte i=0;i<2;i++)
												{
															obj[i]=new Customer();
															obj[i].read();
															/*Member function will create only one copy in the heap whereas data member fuction will create a copy depending on the number of customer*/
												}
												break;
										
										case 2:
												for(byte i=0;i<2;i++)
												{
															obj[i].display();
												}
												break;
												
										case 3:
												System.out.println("1. Serach by Name");
												System.out.println("2. Search by account Number");
												System.out.println("3. Search by Balance");
												
												System.out.println("Enter the choice");
												res1=Byte.parseByte(br.readLine());
												
												switch(res1)	
													{
														case 1:
																String n;
																//System.out.println("Enter the name to search");
																	//n=br.readLine();
																	
															/*Command Line*/	n=args[0];
																	
																	for(byte i=0;i<2;i++)
																	{
																			b1=obj[i].search(n);
																			if(b1==1)
																			{
																				obj[1].display();
																				break;
																			}
																	}
																if(b1==0)
																	{
																	System.out.println("Record not available");
																	}
																break;
															
														case 2:
																long acno;
																System.out.println("Enter the Account no. to be searched");
																acno=Long.parseLong(br.readLine());
																	for(byte i=0;i<2;i++)
																	{
																				b1=obj[i].search(acno);
																				if(b1==1)
																					{
																						obj[i].display();
																						break;
																					}
																	}
																
																	if(b1==0)
																		{
																			System.out.println("Record is not available");
																		}
																
														case 3:
																char gender;
																float balance;
																		System.out.println("Enter the gender to Search");
																		gender=(char)br.read();
																		System.out.println("Enter the balance amount to be search");
																		br.skip(2);
																		balance=Float.parseFloat(br.readLine());
																			for(byte i=0;i<2;i++)
																			{
																				b1=obj[1].search(balance, gender);
																				if(b1==0)
																				{
																					System.out.println("Record not available");
																				}
																				break;
																			}
														case 4:
																ch=false;		
													}
										
									}
						}
				}
			}
	
	/*Attribute of a class = Data Member*/
	/*Static class = System*/
	/*Static member of system class. It is variable. It of string type= 
	out here denotes the reference variable of the type PrintStream class =out*/