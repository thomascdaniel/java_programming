import java.io.*;
import java.util.Scanner;

class Command
{
    private int playerId;
    private String playerName;
    private String kit_Manufacturer;
    private float rate;
    private String kit_type;
    private String kitSerialNumber;


    public void read() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the player id: ");
        playerId = Integer.parseInt(br.readLine());
        System.out.println("Enter the player name: ");
        playerName = br.readLine();
        System.out.println("Enter the manufacturer of the kit: ");
        kit_Manufacturer = br.readLine();
        System.out.println("Enter the kit type:");
        kit_type = br.readLine();
        System.out.println("Enter the rate of the kit: ");
        rate = Float.parseFloat(br.readLine());
        System.out.println("Enter Kit Serial Number:");
        kitSerialNumber = br.readLine();

    }

    public void display()
    {
        System.out.println("Player Details");
        System.out.println("=====*******======");
        System.out.println("Player Id: "+playerId);
        System.out.println("Player Name: "+playerName);
        System.out.println("kit Manufacturer: "+kit_Manufacturer);
        System.out.println("Kit type: "+kit_type);
        System.out.println("Rate: "+rate);
        System.out.println("Serial Number: "+kitSerialNumber);
        System.out.println("=====*******======");

    }
    byte search(String name)
    {
        if(playerName.equals(name))
            return 1;
        else
            return 0;

    }

    byte search(int id)
    {
        if(playerId==id)
            return 1;
        else
            return 0;
    }

    byte search(float rt)
    {
        if(rt==rate)
            return 1;
        else
            return 0;
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean ch=true;
        byte res,res1;
        byte b1=0;
        Command obj[] = new Command[2];

        while(ch)
        {
            System.out.println("\n\t\t***************WELCOME TO SPORTS MANAGEMENT SYSTEM************");
            System.out.println("\n\t\t\t1. Enter the Details of the player");
            System.out.println("\n\t\t\t2. Click to see the list of the players");
            System.out.println("\n\t\t\t3. Search the player");
            System.out.println("\n\t\t\t4. Exit");
            System.out.println("\n\t\t**************************************************************");
            System.out.println("\n\t\t\t\tEnter your choice");
            res=Byte.parseByte(br.readLine());

            switch(res)
            {
                case 1:
                    for(byte i=0;i<2;i++)
                    {
                        obj[i]=new Command();
                        obj[i].read();
                    }
                    break;

                case 2:
                    for(byte i=0;i<2;i++)
                    {
                        obj[i].display();
                    }
                    break;

case 3:
                    System.out.println("1. By Name");
                    System.out.println("2. Id");
                    System.out.println("3. By Rate");
                    System.out.println("Enter your choice: ");
                    res1=Byte.parseByte(br.readLine());
                    switch(res1)
                    {
                        case 1:
                            String n;
                            System.out.println("Enter name: ");
                            n = br.readLine();
                            for(byte i=0;i<2;i++)
                            {
                                b1=obj[i].search(n);
                                if(b1==1)
                                {
                                    obj[i].display();
                                    break;
                                }
                            }
                            if(b1==0)
                            {
                                System.out.println("record not available");
                            }
                            break;
                        case 2:
                            int id;
                            System.out.println("Enter the id to be searched: ");
                            id=Integer.parseInt(br.readLine());
                            for(byte i=0;i<2;i++)
                            {
                                b1=obj[i].search(id);
                                if(b1==1)
                                    obj[i].display();
                                break;
                            }
                            if(b1==0)
                                System.out.println("Record not found");
                            break;

                        case 3:

                            float rt;
                            System.out.println("Enter the rate to be searched: ");
                            rt = Float.parseFloat(br.readLine());
                            for(byte i=0;i<2;i++)
                            {
                                b1=obj[i].search(rt);
                                if(b1==1) {
                                    obj[i].display();
                                    break;
                                }
                            }
                            if(b1==0)
                                System.out.println("Record not found");
                            break;
                    }
                case 4:
                    ch=false;
                    break;
            }
        }
    }
}