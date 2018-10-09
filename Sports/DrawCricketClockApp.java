    import java.applet.*;  
    import java.awt.*;  
    import java.util.*;  
    import java.text.*;  
    import javax.swing.*;
      
    public class DrawCricketClockApp extends Applet implements Runnable
	{  
    	   
	   Image picture; 
       Font bigFont;
       Color pinkColor;
       Color weirdColor;
       Color bgColor;
       Thread t = null;  
       int hours=0, minutes=0, seconds=0;  
       String timeString = "";  
      
       public void init()
	   { 
             System.out.println("init");
	         bigFont = new Font("Arial",Font.BOLD,20);
	         pinkColor = Color.pink;
	         weirdColor = new Color(60,60,122);
	         bgColor= Color.blue;
	         picture = getImage(getDocumentBase(),"NTCA_Ground.jpg");  
	         setBackground(bgColor);	   
             setBackground( Color.yellow);  
       }  
      
	  
       public void start() 
	   {  
            t = new Thread( this );  
            t.start();  
       }  
      
        
       public void run()
	   {  
          try {  
             while (true) {  
      
                Calendar cal = Calendar.getInstance();  
                hours = cal.get( Calendar.HOUR_OF_DAY );  
                if ( hours > 12 ) hours -= 12;  
                minutes = cal.get( Calendar.MINUTE );  
                seconds = cal.get( Calendar.SECOND );  
      
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
                Date date = cal.getTime();  
                timeString = formatter.format( date );  
      
                repaint();  
                t.sleep( 1000 );  // interval given in milliseconds  
             }  
          }  
          catch (Exception e) { }  
       }  

      
        
      public void paint( Graphics g )
	  {  
          
   g.setFont(bigFont);
   g.drawString("Circket Association of India",100,20);
  // g.setColor(pinkColor);
    //g.drawLine(100,100,110,100);
   //for the handle of the bat
    //g.setColor(pinkColor);
    //g.drawLine(110,140,100,100);
    //for the side handle of the bat
    //g.setColor(pinkColor);
    //g.drawLine(120,140,110,100);
    //for the top line of the bat
    //g.drawLine(100,140,130,140);
   //for the side line of the bat
   //g.setColor(pinkColor);
    //g.drawLine(100,140,140,300);
    //g.setColor(pinkColor);
   //for the side line of the bat
    //g.drawLine(130,140,172,280);
    //g.setColor(pinkColor);
    //for the  bottomof the bat
   //g.drawArc(138,265,35,50,180,200);
   //for the  ball
   //g.setColor(Color.red);
   //g.fillOval(200, 250, 40, 40);
   //g.setColor(Color.red);
   //g.drawRect(50,50,400,400);	
   g.drawImage(picture,27,150, this);
   g.setColor( Color.black );  
          g.drawString( timeString, 1200, 100 ); 

	  }
    }  