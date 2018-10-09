import java.io.*;
import java.util.Scanner;
class Account
{
  String custname;
  public int accno;
  private float balance;
  final String bankname="SBI";
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
  public void disp()
  {
    System.out.println("Bank Name: "+bankname);
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
    super.disp();
    //access specifiers
    System.out.println("Interest rate: "+intRate);
    System.out.println("Account No: "+accno);
    System.out.println("Maximum amount sanctioned: "+amountSanc);
  }
  final float interestCalc()
  {
    return (intRate*amountSanc)/100;
  }
}
/*public class Inheritance
{
  public static void main(String []args)
  {
    X ob=new X();
    System.out.println(ob.custname);
    Account a2=new Account();
    a2.read();
    System.out.println(a2.custname);
    a2.disp();
  }
}*/
final class CarLoan extends LoanAccount
{
  String carCompany;
  String carModel;
  int carCost;

  CarLoan(String custName,int accno,float intRate,int amount,String comp,String model,int cost)
  {
    super(custName,accno,intRate,amount);
    carCompany=comp;
    carModel=model;
    carCost=cost;
  }
  CarLoan()
  {
    carCompany="Maruthi";
    carModel="Baleno";
    carCost=700000;
  }
  public void read()
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    try
    {
      super.read();
      System.out.println("Enter the car Company Name: ");
      carCompany=br.readLine();;
      System.out.println("Enter the car Model: ");
      carModel=br.readLine();
      System.out.println("Enter the car cost: ");
      carCost=Integer.parseInt(br.readLine());
    }
    catch(Exception e)
    {
      System.out.println(e.toString());
    }
  }
  public void disp()
  {
    float totInte;
    totInte=interestCalc();
    super.disp();
    System.out.println("Car Company Name: "+carCompany);
    System.out.println("Car Model: "+carModel);
    System.out.println("Car Cost : "+carCost);
    System.out.println("Total Interest: "+totInte);

  }
  /*float interestCalc()
  {
    return (intRate*amountSanc+1000)/100;
  }*/
}
public class Final
{
    public static void main(String []args)
    {
      /*Account a2=new Account();
      a2.disp();
      LoanAccount lc1=new LoanAccount();
      lc1.disp();
      LoanAccount lc=new LoanAccount("aaa",20,1.2000f,100000);
      lc.disp();
      CarLoan c1=new CarLoan("Hari",121,(float)10.0,100000,"Maruthi","800",200000);
      c1.disp();*/
      Account ac = new LoanAccount();
      ac.disp();
      Account ac1=new CarLoan();
      ac1.disp();
    }

}
