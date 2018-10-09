import java.util.*;
import java.io.*;

class Sport {
	//For staff registration
	private int _staffId;
	private String _staffName;
	private char _Medical;
	private char _transport;
	
	
	//For Player registration
	//private
		
		
	public  void  readData() throws IOException {
		BufferedReader br/*object*/=new BufferedReader(new InputStreamReader(System.in));
					
		System.out.println("\t\t***********************");	
		System.out.println("\t\tWELCOME TO CHIRST SPORTS MANAGEMENT SYSTEM");
		
		System.out.println("\t\t***********************");			
		System.out.println("\t\tEnter the Staff ID");
		_staffId=Integer.parseInt(br.readLine());
					
		System.out.println("\t\tEnter the name of Staff Name");
		_staffName=br.readLine();
		
		System.out.println("\t\tEnter whether the staff wants medical Treatment 'Y' YES  or 'N' NO");
		_Medical=(char)br.read(); // External casting 1
					
		System.out.println("\t\tEnter the transport facility: -");
		_transport=(char)br.read(); // External casting 2
	}
				
				
				
	public void display() {
		
		System.out.println("\n\t\t----------------------");
        System.out.println("\t\tSports management System");
        System.out.println("\t\t----------------------");
        System.out.println("\n\t\tOwner Name : Thomas C. Daniel");
        System.out.println("\n\t\tID : 16472560");
        System.out.println("\n\t\t");
        System.out.println("\n\t\t");
        System.out.println("\t\t----------------------\n\n");
		System.out.println("***********************");	
		
		
		System.out.println("Staff Details");
		System.out.println("***********************");		
					
		System.out.println("Staff ID:"+_staffId);
		System.out.println("Staff Name:"+_staffName);
		System.out.println("Medical Facility:"+_Medical);
		System.out.println("Transport:"+_transport);
					
	}



	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Sport  s1= new Sport();
		s1.readData();
		s1.display();
						
						
						
	}
}