import java.io.*;
class B	
	{
		private int accNo;
	}
	
public void read() throws IOException
	{
		System.out.println("Enter the Account Number");
		accNo=	Int.parseInt(br.readLine());
	}
public void display()
	{
		System.out.println("Amount"+accNo);
	}


public class A	
	{
		public static void main(String args[])
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			boolean ch=true;
			byte res, res1, b1;
				
					
					
					
					B obj[]= new B[2];
					ob1.display();
					
					while(ch)
						{
							System.out.println("1. Read Data");
							System.out.println("2. Display Data");
							System.out.println("3. Exit");
							System.out.println("Enter the choice" );
							res=Byte.parseByte(br.readLine());
							
							switch(res)
									{
										case 1:
												for(byte i=0;i<2;i++)
												{
															obj[i]=new B();
															obj[i].read();
												}
												break;
										
										case 2:
												for(byte i=0;i<2;i++)
												{
															obj[i].display();
												}
												break;
												
										case 3:
												ch=false;
									}
						}
				}
			}