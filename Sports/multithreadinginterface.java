class Count extends Thread
{
   Thread mythread ;
   Count()
   { 
      System.out.println("\n\t\t\tWELCOME TO CIRCKET ASSOCIATION\n");
	  mythread = new Thread(this, "\nNO. of players in a team is 11"); //my runnable thread
      System.out.println("\n\t\t\t\tSELECTION PROCESS\n" + mythread); //my thread created
      mythread.start();
   }
   public void run()
   {
      try
      {
        for (int i=0 ;i<10;i++)
        {
          System.out.println("No. of players selected " + i); //Printing the count
          Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("Not selected"); //my thread interrupted
     }
     System.out.println("Selection process is over" ); //mythread run is over
   }
}
class multiThreadingInterface
{
    public static void main(String args[])
    {
       Count cnt = new Count();
       try
       {
          while(cnt.mythread.isAlive())
          {
            System.out.println("Coach will select the players"); //Main thread will be alive till the child thread is live
            Thread.sleep(1500);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println("SELECTION PROCESS IS INTERRUPTED"); //Main thread interrupted
       }
       System.out.println("SELECTION PROCESS IS OVER" ); //Main thread run is over
    }
}