import java.util.*;
import java.io.*;

class Worker {
	private int id;
	private String _empName;
	private double _basicPay;
	static long scustId;
  private long custId;

            public long Worker()
              {
                scustId++;
                return custId=scustId;

              }


	public  void  readData() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


		//System.out.println("Enter the employee ID");
		//id=Integer.parseInt(br.readLine());

		System.out.println("Enter the name of Employee");
		_empName=br.readLine();

		System.out.println("Enter the basic pay");
		_basicPay=Double.parseDouble(br.readLine());
	}


	public double Calculatesalary() {
		return (_basicPay + new Double(_basicPay*0.5) + new Double(_basicPay*0.1));
	}


	public void display() {
		System.out.println("Employee Salary Details");
		System.out.println("***********************");

		System.out.println("Worker ID="+Worker());
		System.out.println("Basic Pay:"+_basicPay);
		System.out.println("DA:"+new Double(_basicPay*0.5));
		System.out.println("HRA:"+new Double(_basicPay*0.1));
		System.out.println("Total Salary:"+ Calculatesalary());

	}

	static
                    {
                      scustId=100;

                      //System.out.println(custId);
                    }

	  public static void main(String[] args) throws IOException
                  {

                      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					                 boolean ch=true;
					                 byte res;
                             Worker wr=new Worker();
                           while(ch)
                           {
                             System.out.println("1. Read Data");
							               System.out.println("2. Display Data");
							               System.out.println("3. Exit" );
							               System.out.println("Enter the choice" );

                             res=Byte.parseByte(br.readLine());

                             switch(res)
                              {
                                case 1:
                                for(byte i=0;i<2;i++)
                                  {
                                    wr=new Worker();
                                    wr.readData();
                                  }
                                    break;

                               case 2:
                               for(byte i=0;i<2;i++)
                               {
                                 wr.display();
                               }
                                   break;
                              case 3:
                              ch=false;
                            }

                      }





	}
}
