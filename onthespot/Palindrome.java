import.java.util.*;
import.java.io.*;

class Palindrome
    {
      String s = "hello world";
      String t = "";

        /*System.out.println("Enter the sentence which you want to check");
        name=br.readLine();*/

        for (int i = 0; i < s.length(); i++)
         {
           char ch = s.charAt(i);
            if (!temp.isEmpty())
              {
              temp += " ";
              }

              int n = (int)ch - (int)'a' + 1;
              temp += String.valueOf(n);
         }

         System.out.println(temp);

public static void main(String[] args) throws IOException
        {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                Palindrome pa= new Palindrome();
        }

    }
