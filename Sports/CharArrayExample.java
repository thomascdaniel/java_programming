import java.io.CharArrayWriter;  
import java.io.FileWriter;    
import java.io.CharArrayReader;  
public class CharArrayExample
{  

  public static void main(String[] ag) throws Exception
   {  
     System.out.println("\n\t\t\tWELCOME TO CIRCKET ASSOCIATION\n");
	 System.out.println("\n\t\t\t\tVALUES OF ALPAHBETS\n");
    char[] ary = { 'C', 'R', 'I', 'C', 'K', 'E','T', 'E', 'R', 'S' };  
    CharArrayReader reader = new CharArrayReader(ary);  
    CharArrayWriter out=new CharArrayWriter();    
          out.write(ary);    
          FileWriter f1=new FileWriter("a.txt");    
    int k = 0;  
    // Read until the end of a file  
    while ((k = reader.read()) != -1) {  
      char ch = (char) k;  
      System.out.print(ch + "\t\t\t\t : ");  
      System.out.println(k);  
    }  
              out.writeTo(f1);    
          f1.close();    
           
          System.out.println("\t\t\t\t\tSuccess...");    

  }  
}  