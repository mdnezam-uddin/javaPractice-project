package Car_management_system;

import java.util.Scanner;

public class ShowRoom implements Utility {
    String showroomName;
    String showroomAdd;
    String managerName;
    int totalEmployees;
    int totalCarInStock=0;

    public void getDetails(){
        System.out.println("Showroom Name: "+showroomName);
        System.out.println("Showroom Address: "+showroomAdd);
        System.out.println("Manager Name: "+managerName);
        System.out.println("Total Employee: "+totalEmployees);
        System.out.println("Total Car In Stock: "+totalCarInStock);
    }

    public void setDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("=========== ****** Enter Showroom Details ****** ===========");
        System.out.println();
        System.out.print("Showroom Name: ");
        showroomName = sc.nextLine();
        System.out.print("Showroom Address: ");
        showroomAdd = sc.nextLine();
        System.out.print("Manager Name: ");
        managerName = sc.nextLine();
        System.out.print("Total no of Employees: ");
        totalEmployees = sc.nextInt();
        System.out.print("Total no of Cars: ");
        totalCarInStock = sc.nextInt();

    }
}
