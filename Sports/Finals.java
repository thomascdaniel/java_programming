import java.io.*;

abstract class kits{
    final String comName = "Association of Cricket";
    public int kitID;
    static int statickitID;
    public String kitType;
    public float kitPrice;
    abstract float totalPrice();

    static {
        statickitID = 1000;
    }

    public kits(){
        statickitID++;
        kitID = statickitID;
        kitType = "Oil Filter";
        kitPrice = 2500;
    }

    public kits(int kitID, String kitType, float kitPrice){
        this.kitID = kitID;
        this.kitType = kitType;
        this.kitPrice = kitPrice;
    }

    public void read(){
        try{


            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter kit type: ");
            kitType = br.readLine();
            System.out.println("Enter kit price: ");
            kitPrice = Float.parseFloat(br.readLine());
        }
        catch(NullPointerException ex){
            ex.printStackTrace();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        catch(Exception ex){
           ex.printStackTrace();
        }
    }
    public void display(){
        System.out.println("**kit Details***");
        System.out.println("Company name : "+comName);
        System.out.println("kit ID is: "+kitID);
        System.out.println("kit type is: "+kitType);
    }
}
class Vehicle extends kits{
    private int vehicleID;
    public String vehicleModel;
    public String vehicleCompany;
    public String kitType;
    private float vehiclePrice;
    private int quantity;
    public float price;
    static int static_vehicleID;

    static {
        static_vehicleID = 2000;
    }

    public Vehicle(){
        super();
        static_vehicleID++;
        vehicleID = static_vehicleID;
        vehicleModel = "Baleno 2017";
        vehicleCompany = "Maruti Suzuki";
        kitType = "Alloy Wheel Rims";
        vehiclePrice = 670000;
        quantity = 2;
    }
    public Vehicle(int kitID, String kitType, float kitPrice, String model, String company, String type, int id, float price, int quan){

        super(kitID, kitType,kitPrice);
        this.vehicleID = id;
        this.vehicleModel = model;
        this.vehicleCompany = company;
        this.kitType = type;
        this.vehiclePrice = price;
        this.quantity = quan;
    }

    public void read(){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter vehicle model: ");
            vehicleModel = br.readLine();
            System.out.println("Enter vehicle company: ");
            vehicleCompany = br.readLine();
            System.out.println("Enter kit type: ");
            kitType = br.readLine();
            System.out.println("Enter kit price: ");
            super.kitPrice = Float.parseFloat(br.readLine());
            System.out.println("Enter quantity purchased: ");
            quantity = Integer.parseInt(br.readLine());
        }
        //catch(InvalidFormatException ex){
            //ex.printStackTrace();
        /*}*/
        catch(IOException ex){
            ex.printStackTrace();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("Program Demo completed!");
        }
    }

    @Override
    float totalPrice(){
        return (kitPrice*quantity);
    }

    final float taxCalculate(){
        return ((totalPrice()*14)/100);
    }

}

final class Purchase1 extends Vehicle {
    String custName;
    String custNumber;

    public Purchase1() {
        custName = "Himanshu";
        custNumber = "8861847120";
    }

    public void read() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            super.read();
            System.out.println("Enter customer name: ");
            custName = br.readLine();
            System.out.println("Enter customer number: ");
            custNumber = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void display() {
        float total = totalPrice();
        //super.display();
        System.out.println("kit id is: " + statickitID);
        System.out.println("kit Type is: " + kitType);
        //System.out.println("Super kit Type is: " + super.kitType);
        System.out.println("Vehicle ID is: " + static_vehicleID);
        System.out.println("Car Model is: " + vehicleModel);
        System.out.println("Customer name is: " + custName);
        System.out.println("Customer number is: " + custNumber);
        System.out.println("Total cost is: " + total);


    }
}
public class Finals {

    public static void main(String[] args){
    
        kits pr[] = new Vehicle[2];
        for(byte i=0;i<2;i++) {
            pr[i] = new Vehicle();
            pr[i].display();
        }
       //Vehicle v1 = new Vehicle();
       //v1.display();

        Vehicle v2 = new Vehicle(101, "Bumper",4500,"Mustang 2016", "Ford", "Car", 50001, 569000,2);
        v2.display();

        Purchase1 purc[] = new Purchase1[2];
        for(byte i=0;i<2;i++) {
            purc[i] = new Purchase1();
            purc[i].read();
            purc[i].display();
        }
    }
}
