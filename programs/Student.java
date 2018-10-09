import java.util.*;
import java.io.*;

class Detail
	{
	private String _studName;
	private char _course;
	private byte _rollNo;
	private int _scienceMarks, _mathMarks, _soscienceMarks, _englishMarks, _hindiMarks;
	
	
	
		public void read() throws IOException
		{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name of the student");
		_studName=br.readLine();
		
		System.out.println("Enter the Course");
		_course=char.parseChar(br.readLine());
	
		System.out.println("Enter the Roll No.");
		_rollNo=byte.parseByte(br.readline());
		
		System.out.println("Enter the marks of the following subjects: -");
		
		System.out.println("Science");
		_scienceMarks=int.parseInt(br.readLine());
		
		System.out.println("Maths")
		_mathMarks=int.parseInt(br.readLine());
		
		System.out.println("Social Science")
		_soscienceMarks=int.parseInt(br.readLine());
		
		System.out.println("English");
		_englishMarks=int.parseInt(br.readLine());
		
		System.out.println("hindi");
		_hindiMarks=int.parseInt(br.readLine());
		}

			public void display()
			{
			System.out.println("Student's Name\t"+_studName);
			System.out.println("Course\t"+_course);
			System.out.println("Roll No\t"+_rollNo);
			System.out.println("Marks are: -\t\t\t");
				System.out.println("Science/t"+_scienceMarks);
				System.out.println("Maths\t"+_mathsMarks);
				System.out.println("Social Science\t"+_soscienceMarks);
				System.out.println("English\t"+_englishMarks);
				System.out.println("Hindi\t"+_hindiMarks);
				
			System.out.println("Result: - "+result);
			}
	
			class calulate()
			{
				byte result, obtained, total=500
				obtained=_scienceMarks+_englishMarks+_hindiMarks+_mathMarks+_soscienceMarks;
				result=obtained/total*100;
				
			}
	}
class Student
	{
	public static void main (String args[]) throws IOException
		{
			ob.calculate();
			ob.read();
			ob.display();
		}
	
	}