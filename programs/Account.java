class Account
  {
  private String custName;
  private int accNo;
  Account()
      {
        custName="";
        accNo=1;
      }

  Account(String custName)
      {
      this.custName=custName;
      }
  Account(String custName, int accno)
      {
      this(custName);// constructor chaining
      this.accno=accno;
      }
  }

public void read()
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    try
      {
      System.out.println("Enter the Customer Name");
      custName= br.readLine();

      System.out.println("Enter the account Number");
      accNo=Int.parseInt(br.readLine());
      }
  }
