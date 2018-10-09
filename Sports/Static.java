import java.io.*;

class Purchase
{
 
  public String pdate;
  public String pitem;
  public int amt;
  public byte qty;
  public Double total;
  public String retailplace;
  private static long custId;
  private static long scustId=100;
		
		static void id() //static block 
		{
			
			scustId++;
			custId=scustId;
			System.out.println(custId);
		}
		
		/*Purchase(){
			scustId++;
			custId = scustId;
		}*/	
		
		
        public void bill()
        {
			Purchase.id();
          //Function Overloading without parameters
          System.out.println("Purchased Item : Cricket Kit");
          System.out.println("Amount : Rs 5,000 /-");
          System.out.println("Quantity : 1 ");
          System.out.println("Total : Rs 5,000 /-");
          System.out.println("Retail Place : Udaipur ");
        }

        public void readKit()throws IOException
        {
			Purchase.id();
            BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the brand name :");
            pitem=re.readLine();

            bill(pitem);
        }

        public void readItem()throws IOException
        {
            BufferedReader re=new BufferedReader(new InputStreamReader(System.in));


            System.out.println("Enter the purchased item name :");
            pitem=re.readLine();

            System.out.println("Enter the Total :");
            total=Double.parseDouble(re.readLine());

            bill(pitem,total);
        }


      public void bill(String pitem) throws IOException
    {
      //Function Overloading with 1 parameter
      System.out.println("Purchased Item : "+pitem);
      System.out.println("Amount : Rs 2,000 ");
      System.out.println("Quantity : 1");
      System.out.println("Total : Rs 2,000 ");
      System.out.println("Retail Place : Bengaluru");
    }

    public void bill(String pitem, Double total) throws IOException
  {
    //Function Overloading with 2 parameters
    System.out.println("Purchased Item : "+pitem);
    System.out.println("Quantity : 1");
    System.out.println("Total : "+total);
    System.out.println("Retail Place : Bengaluru");
  }
}

  public class Static
  {
      public static void main (String[] args) throws IOException
      {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        boolean ch=true;
        byte res;
        Purchase obj[]= new Purchase[1];
        System.out.println("\n\t\t----------------------");
        System.out.println("\t\tSports management System");
        System.out.println("\t\t----------------------");
        System.out.println("\n\t\tCustomer Name : Thomas C. Daniel");
        System.out.println("\n\t\tCustomer ID : 16472560");
        System.out.println("\n\t\tAge : 22");
        System.out.println("\n\t\tGender : M");
        System.out.println("\t\t----------------------\n\n");
        while(ch)
        {
            System.out.println("\nEnter the options for item you purchased");
            System.out.println("1. Cricket kit");
            System.out.println("2. Which brand/-");
            System.out.println("3. Any other items");
            System.out.println("4. Exit\n");

            System.out.println("Enter your choice\n");
            res=Byte.parseByte(b.readLine());
            switch(res)
            {
              case 1:for(byte i=0;i<1;i++)
                      {
                        obj[i]=new Purchase();
                        obj[i].bill();

                      }
                      break;

              case 2:for(byte i=0;i<1;i++)
                      {
                        obj[i].readKit();

                      }
                      break;
              case 3:for(byte i=0;i<1;i++)
                      {
                        obj[i].readItem();

                      }
                      break;
              case 4: ch=false;

            } //end of outer
        }
      }
  }
