package EMPLOYEE;

import java.util.Scanner;

interface Aman{
    public void set_details();
    public void get_details();
}
public class Main {

      static void Menu(){
        System.out.println("++++++++++++++++++++++ Welcome To Car Showroom +++++++++++++++++++++++");
        System.out.println();
        System.out.println("      1. Add Showroom   "+"2. Add Employee   "+"3. Add Cars    ");
        System.out.println();
        System.out.println("      4. View Showroom  "+"5. View Employee  "+"6. View Cars   ");
        System.out.println();
        System.out.println("++++++++++++++++++++++ Enter 0 To Exit +++++++++++++++++++++++");
        System.out.println();
        System.out.println("++++++++++++++++++++ Thanks To Using Car Showroom +++++++++++++++++++++");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Showroom showroom = new Showroom();
        Employees employees = new Employees();
        Cars cars = new Cars();
        
        while (true) {
            Menu();
        System.out.println("Enter Your Choice");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                  showroom.set_details();
                  break;
            case 2:
                  employees.set_details();
                  break;
            case 3:
                  cars.set_details();
                  break;
            case 4:
                  showroom.get_details();
                  break;
            case 5:
                  employees.get_details();
                  break;
            case 6:
                  cars.get_details();
                  break;
            case 0:
                  System.exit(0);
                  break;
        
            default:
                  System.out.println("Enter valid Choice");
                break;
        }
        }
    }
}
