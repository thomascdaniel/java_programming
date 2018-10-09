import java.io.*;

abstract class Bill{
   abstract void purchase() throws IOException;
   abstract void sales() throws IOException;
   public int balance=10000;
}

 abstract class Payment extends Bill
 {
      public int qty,rate;
      static int amt,total;
      public String item;
      int n=1;
      public void purchase()
	  {
	 	final String a="RAJASTHAN ROYALS";		 
		System.out.println("\t\t"+a);
		System.out.println("\n\t\t--------------------------------");
        System.out.println("\t\tSPORTS MANAGEMENT SYSTEM");
        System.out.println("\t\t----------------------------------");
		System.out.println("\t\t---------ITEMS PURCHASED----------");
        System.out.println("\t\tMAIN BALANCE : " +balance);
      System.out.println();
	try{
		
	
      do
		{
      System.out.println("----------ITEMS Purchase----------");
      System.out.println("Enter the item name  ");
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      item=br.readLine();
      System.out.println("Enter the Quantity Purchased");
      qty=Integer.parseInt(br.readLine());
      System.out.println("Enter the cost of the item");
      rate=Integer.parseInt(br.readLine());
      amt=qty*rate;
      total=total+amt;

      balance =balance- amt;
      System.out.println("Any Other Item : Yes-1 or No-0");
      n=Integer.parseInt(br.readLine());
		} 
	  while(n==1); 
      System.out.println("Total Stock Purchase is "+total);
      System.out.println("The current Balance is "+balance);
    }
	catch(ArithmeticException x)
	  {
		  System.out.println("Enter string value not a numbers");
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  		  System.out.println("ArrayIndexOutOfBoundsException");

		  
	  }
	  catch(Exception e)
	  {

	  }
	  
	  }
	}
	  
	  

// Stock sales
 final class Receipt extends Payment{
  public int qty,rate,amt;
  public int item,s;
  public void sales() throws IOException{
    System.out.println("\t\t-----------Enter the Sale ---------");
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   do{
    System.out.println("-----------KIT Items Sales----------");
    System.out.println("1. Cricket Kit");
    System.out.println("2. Cricket Balls");
    System.out.println("3. Cricket Accessories ");
 this.item=Integer.parseInt(br.readLine());

 switch(this.item)
{
case 1:

    {
    System.out.println("Enter the Quantity Sold");
    
    this.qty=Integer.parseInt(br.readLine());
    System.out.println("Enter the cost of the item");
    this.rate=Integer.parseInt(br.readLine());
    this.amt=this.qty*this.rate;
  System.out.println("Cash In Counter : "+super.amt);
    System.out.println("Sale Amount : "+this.amt);
    System.out.println("The current Balance in Counter : "+balance);
   // balance-=super.amt;
    balance+= this.amt;
    System.out.println("The current Balance after the transaction is "+balance);
  
    break;
  }
  case 2:{
    System.out.println("Enter the Quantity Sold");
    
    this.qty=Integer.parseInt(br.readLine());
    System.out.println("Enter the cost of the item");
    this.rate=Integer.parseInt(br.readLine());
    this.amt=this.qty*this.rate;
  System.out.println("Cash In Counter : "+super.amt);
    System.out.println("Sale Amount : "+this.amt);
    System.out.println("The current Balance in Counter : "+balance);  //balance-=super.amt;
    balance+= this.amt;
    System.out.println("The current Balance after the transaction is "+balance);
  
    break;

  }
  case 3: {
    System.out.println("Enter the Quantity Sold");
    
    this.qty=Integer.parseInt(br.readLine());
    System.out.println("Enter the cost of the item");
    this.rate=Integer.parseInt(br.readLine());
    this.amt=this.qty*this.rate;
	System.out.println("Cash In Counter : "+super.amt);
    System.out.println("Sale Amount : "+this.amt);
    System.out.println("The current Balance in Counter : "+balance);    balance+= this.amt;
    System.out.println("The current Balance after the transaction is "+balance);
  
    break;

  }
  default :

 return;

}

     System.out.println("Any Other Item : yes-1 or No-0");
      s=Integer.parseInt(br.readLine());
} while(s==1);
}
}
public class Abstract{
  public static void main(String args[]) throws IOException{
    int s=1;
    Receipt obj=new Receipt();
    
              //obj=new Receipt();
              obj.purchase();
              obj.sales();
      }
}