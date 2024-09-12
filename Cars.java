package EMPLOYEE;

import java.util.Scanner;
public class Cars extends Showroom implements Aman {

    Scanner scanner = new Scanner(System.in);

    String Car_Name;
    String Car_Color;
    String Car_Fueltype;
    double Car_Price;
    String Car_Type;
    String Car_Transmission;
    
    @Override
    public void set_details(){
       System.out.println("+++++++++++ Enter Cars Details +++++++++++");
       System.out.println();
       System.out.println("Enter Car Name");
       Car_Name = scanner.nextLine();
       System.out.println("Enter Car Color");
       Car_Color = scanner.nextLine();
       System.out.println("Enter Car Fuel Type");
       Car_Fueltype = scanner.nextLine();
       System.out.println("Enter Car Type");
       Car_Type = scanner.nextLine();
       System.out.println("Enter Car TransMisson");
       Car_Transmission = scanner.nextLine();
       System.out.println("Enter Car Price");
       Car_Price = scanner.nextDouble();
       total_car++;
       System.out.println("Car Added Successfully");
    }
    
    @Override
    public void get_details(){
       System.out.println("Car Name is: "+Car_Name);
       System.out.println("Car Color is:"+Car_Color);
       System.out.println("Car Fuel Type is:"+Car_Fueltype);
       System.out.println("Car Type is: "+Car_Type);
       System.out.println("Car Transmisson is: "+Car_Transmission);
       System.out.println("Car Price is: "+Car_Price);
       System.out.println("Total cars: "+total_car);
    }
}
