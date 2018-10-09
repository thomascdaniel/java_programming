import Account.Deposit;
import Account.withdraw;
import java.io.*;
import java.util.Scanner;

abstract class Account
{
  String custname;
  public int accno;
  private float balance;
  final String bankname="SBI";
  abstract float interestCalc();
  // the definition is not given here as it is abstract method.abstract metod is ovverridden
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
  public float getBalance()
  {
    return balance;
  }
  public void setBalance(float bal)
  {
    balance=bal;
  }
}

/*class LoanAccount extends Account
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
  float interestCalc()
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
/*final class CarLoan extends LoanAccount
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
  }
}*/
 class SavingAccount extends Account implements withdraw
{
  private float minbal;
  public void read()
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    try
    {
      super.read();
      System.out.println("Enter the minimum balance: ");
      minbal=Float.parseFloat(br.readLine());
    }
    catch(Exception e)
    {
      System.out.println(e.toString());
    }
  }
  float interestCalc()
  {
    float inte=(float)(0.04*minbal);
    return inte;
  }
  public void withdraw1() throws IOException
  {
    int amt;
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("Enter the amount to withdraw");
    amt=Integer.parseInt(br.readLine());
    if(getBalance()-amt>minbal)
    {
      setBalance(getBalance()-amt);
    }
    else
    {
      System.out.println("Sorry ! Amount exceeds minimum balance");
    }
  }
  public void disp()
  {
    super.disp();
    //access specofoers
    System.out.println("Minimum balance : "+minbal);
    //System.out.println("Account No: "+accno);
  }
}
public class Interface
{
    public static void main(String []args) throws IOException
    {
      SavingAccount ac=new SavingAccount();
      ac.read();
      //ac.disp();
      ac.withdraw1();
      ac.disp();
    }

}
