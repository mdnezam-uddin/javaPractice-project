package Car_management_system;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends ShowRoom implements Utility {
    String emName;
    String emId;
    int age;
    String emDepart;

    public void getDetails(){
        System.out.println("Employee Name: "+emName);
        System.out.println("Employee Id: "+emId);
        System.out.println("Age: "+age);
        System.out.println("Department: "+emDepart);
        System.out.println("Showroom Address: "+showroomAdd);
    }

    public void setDetails(){
        Scanner sc=new Scanner(System.in);
        UUID uuid=UUID.randomUUID();
        emId=String.valueOf(uuid);
        System.out.println("========== ********* Enter Employee Details ********** ============");
        System.out.println();
        System.out.print("Employee Name: ");
        emName=sc.nextLine();
        System.out.print("Age: ");
         age=sc.nextInt();
        System.out.print("Department: ");
        emDepart=sc.nextLine();
        System.out.println();
        System.out.print("Showroom Name: ");
        showroomName=sc.nextLine();
    }
}
