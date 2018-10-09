//que store 10 names in file and get it from file sort it before displaying
import java.io.*;
import java.util.*;
class File2
{
  static String [] name = new String[10];
  public static void main(String [] args) throws IOException
  {
    FileOutputStream fileout = new FileOutputStream("names1.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for(int i =0 ; i<10;i++)
    {
      System.out.println("Enter "+i+" name");
      name[i] = br.readLine();
    }

    PrintWriter pw = new PrintWriter("names1.txt", "UTF-8");
    for (int i=0; i<10; i++) {
      pw.println(name[i]);
    }
    pw.close();
    FileReader fis = new FileReader("names1.txt");
    
    BufferedReader br2 = new BufferedReader(fis);
    String temp, temp2, name2[] = new String[10];
    int i=0;
    while((temp = br2.readLine()) != null)
        name2[i++] = temp;

        for (i=0; i<10; i++) {
          for (int j=i+1; j<10; j++) {
            if((name2[i].compareTo(name2[j])) > 0) {
              temp2 = name2[i];
              name2[i] = name2[j];
              name2[j] = temp2;
            }
          }
        }
        System.out.println("\nSorted Display...");
      for (i=0; i<10; i++) {
        System.out.println(name2[i]);
      }
  }
}
