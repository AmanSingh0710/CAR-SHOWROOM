package EMPLOYEE;

import java.util.Scanner;
import java.util.UUID;
public class Employees extends Showroom implements Aman{
    Scanner scanner = new Scanner(System.in);
    UUID uuid = UUID.randomUUID();
    
    String Employee_id;
    String Employee_Name;
    int Employee_age;
    String Employee_Department;

    @Override
    public void set_details(){
      Employee_id = String.valueOf(uuid);
      System.out.println("+++++++++++ Enter Employee Details +++++++++++");
      System.out.println();
      System.out.println("Enter Employee Name");
      Employee_Name = scanner.nextLine();
      System.out.println("Enter Employee Department");
      Employee_Department = scanner.nextLine();
      System.out.println("Enter Employee Age");
      Employee_age = scanner.nextInt();
      total_Employee++;
    }

    @Override
    public void get_details(){
      System.out.println("Showroom Name: "+showRoom_Name);
      System.out.println("Employee ID: "+Employee_id); 
      System.out.println("Employee Name: "+Employee_Name);
      System.out.println("Employee Department: "+Employee_Department); 
      System.out.println("Employee Age: "+Employee_age);
    }
}
