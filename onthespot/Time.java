import java.io.*;

public class Time {
    
    int hh;
    int mm;
    
    public Time(){
        hh = 00;
        mm = 00;
    }
    void readTime() throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter time in hours");
        hh =Integer.parseInt(br.readLine());
        System.out.println("Enter time in minutes");
        mm = Integer.parseInt(br.readLine());
    }
    
    void dispTime(){
     System.out.println("/n");
	 System.out.println("Entered time is: "+ hh + ":" +mm);
        
    }
    
    public int timeToMinutes(){
        int min;
        min = mm + (hh*60);
        return min;
    }
    
    void minutesToTime(int m){
        int min = (m/60);
        int hr = (m%60);
        System.out.println("Minutes "+m+" in hh:mm is: "+min+":"+hr);
    }
    
    void diff(int endtime, int starttime){
        
        minutesToTime(endtime - starttime);
        
    }
    
    public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     Time time = new Time();
     time.readTime();
     time.dispTime();
	 
     System.out.println("Entered to minutes = "+time.timeToMinutes());
     System.out.println("Enter total minutes");
     time.minutesToTime(Integer.parseInt(br.readLine()));
	 
     int start_hh,start_mm,end_hh,end_mm,start_time,end_time;
     System.out.println("Enter start time:(hours) ");
     start_hh =Integer.parseInt(br.readLine());
     System.out.println(":(minutes) ");
     start_mm =Integer.parseInt(br.readLine());
     start_time = start_mm + (start_hh*60);
     System.out.println("Start time is (in minutes): "+start_time);
     
     System.out.println("Enter end time:(hours) ");
     end_hh =Integer.parseInt(br.readLine());
     System.out.println(":(minutes) ");
     end_mm =Integer.parseInt(br.readLine());
     end_time = end_mm + (end_hh*60);
     System.out.println("End time is (in minutes): "+end_time);
     time.diff(end_time, start_time);
    }
    
    
 }
 
