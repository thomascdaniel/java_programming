import java.util.*;
import java.io.*;

class Sport {
	private int id;
	private String _empName;
	private double _basicPay;
		
		
	public  void  readData() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					
					
		System.out.println("Enter the employee ID");
		id=Integer.parseInt(br.readLine());
					
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
					
		System.out.println("Employee Name:"+id);
		System.out.println("Employee ID:"+_empName);
		System.out.println("Basic Pay:"+_basicPay);
		System.out.println("DA:"+new Double(_basicPay*0.5));
		System.out.println("HRA:"+new Double(_basicPay*0.1));
		System.out.println("Total Salary:"+ Calculatesalary());
					
	}


	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Sport  s1= new Sport ();
		s1.readData();
		s1.display();
						
						
						
	}
}