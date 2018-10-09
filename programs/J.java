import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;




public class J
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        final Map<Character, Integer> map;
        String name;
        int count=0;

        System.out.println("Enter the name");
    		name=br.readLine();

        //map = new HashMap<>();
        map = new HashMap<Character, Integer>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);

        for(final char c : name.toCharArray())
        {
            final Integer val;

            val = map.get(c);

            if(val == null)
            {
                // some sort of error
            }
            else
            {
                System.out.print(val + " ");

                String str;
                String answer="", ar[]= str.split(" ");
                for(int i=0;i < ar.length;i++)
                {
                  if(isPalindrome(ar[i]))
                  {
                    count++;
                    answer += ar[i] + " ";
                  }
                }
                System.out.println("OUTPUT:\t\t"+answer+"\nNUMBER OF PALINDROMIC WORDS: "+count);
            }

        }

          //System.out.println("//");
    }

    public static boolean isPalindrome(String str[])
    {
      char ch;
      int len=str.length(),half=len/2;
      for(int i=0;i < half;i++)
      {
      if(str.charAt(i)!=str.charAt(len-i-1))
      {
      return false;
      }
      }
      return true;
    }
}
