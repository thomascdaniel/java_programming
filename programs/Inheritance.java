import java.io.*;
import java.util.Scanner;
class Account
{
  String custname;
  public int accno;
  private float balance;
  Account()
  {
    custname="";
    accno=-1;
  }
  Account(String custName)
  {
    this.custname=custName;
  }
  Account(String custName,int accno)
  {
    this(custName);//constructor chaining
  }

  public void read()
  {
    InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    try
    {
      System.out.println("\nEnter the Customer Name: ");
      custname=br.readLine();
      System.out.println("\nEnter Account No: ");
      accno=Integer.parseInt(br.readLine());
      System.out.println("\nEnter account Balance: ");
      balance=Float.valueOf(br.readLine());
    }
    catch(Exception e)
    {
      System.out.println(e.toString());
    }
  }
  public void display()
  {
    System.out.println("Account Name= "+custname);
    System.out.println("Account Number= "+accno);
    System.out.println("Balance Amount= "+balance);
  }
  /*public float getBalance()
  {
    return balance;
  }
  public void setBalance(float bal)
  {
  balance=bal;
}*/
}
class X extends Account
{

}
class LoanAccount extends Account
{
  float intRate;
  int amountSanc;
  public LoanAccount()
  {
    super();
    intRate=(float)0.0;
    amountSanc=0;
  }
  public LoanAccount(String custName,int accno,float intRate,int amount)
  {
    super(custName,accno);
    this.intRate=intRate;
    amountSanc=amount;
  }
  public void read()
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    try
    {
      super.read();
      System.out.println("Enter the Interest Rate: ");
      intRate=Float.valueOf(br.readLine());;
      System.out.println("Enter the maximum amount sanctioned");
      amountSanc=Integer.parseInt(br.readLine());
    }
    catch(Exception e)
    {
      System.out.println(e.toString());
    }
  }
  public void disp()
  {
    super.display();
    //access specifiers
    System.out.println("Interest rate: "+intRate);
    System.out.println("Account No: "+accno);
    System.out.println("Maximum amount sanctioned: "+amountSanc);
  }
}
public class Inheritance
{
  public static void main(String []args)
  {
    X ob=new X();
    System.out.println(ob.custname);
    Account a2=new Account();
    a2.read();
    System.out.println(a2.custname);
    a2.display();
  }
}
