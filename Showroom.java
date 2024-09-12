package EMPLOYEE;

import java.util.Scanner;

public class Showroom implements Aman{
    Scanner scanner = new Scanner(System.in);

    String showRoom_Name;
    String showRoom_Address;
    int total_Employee;
    int total_car = 0;
    String manger_Name;
    
    @Override
    public void set_details(){
        System.out.println("+++++++++++ Enter Showroom Details +++++++++++");
        System.out.println();
        System.out.println("Enter Showroom Name:");
        showRoom_Name = scanner.nextLine();
        System.out.println("Enter Showroom Address: ");
        showRoom_Address = scanner.nextLine();
        System.out.println("Enter Showroom Manger:");
        manger_Name = scanner.nextLine();
        System.out.println();
        System.out.println("+++++++++++++++++++ Thanks +++++++++++++++++++");
    }
    
    @Override
    public void get_details(){
        System.out.println("Showroom Name is: "+showRoom_Name);
        System.out.println("Showroom Address is: "+showRoom_Address);
        System.out.println("Showroom Manager Name is: "+manger_Name);
        System.out.println("Total Employee in Showroom are: "+total_Employee);
        System.out.println("Total Cars in Stock are: "+total_car);
    }
}
