package Car_management_system;

import java.util.Scanner;

interface Utility{
    public void setDetails();
    public void getDetails();
}
public class Main {

    static void mainMenu(){
        System.out.println();
        System.out.println("========= ***** Welcome To Showroom Management System ****** ========");
        System.out.println();
        System.out.println("========= ***** Enter your Choice ****** =========");
        System.out.println();
        System.out.println("1.Add Showroom \t\t\t 2.Add Employee \t\t\t 3.Add Cars");
        System.out.println();
        System.out.println("4.Get Showroom \t\t\t 5.Get Employee \t\t\t 6.Get Cars");
        System.out.println();
        System.out.println("============== ******** Enter 0 to Exit ******** ===============");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ShowRoom showroom[] =new ShowRoom[5];
        Employees employees[] =new Employees[5];
        Car car[] =new  Car[5];

        int carCounter=0;
        int showroomCounter=0;
        int employeesCounter=0;
        int choice=100;

        while(choice!=0){
            mainMenu();
            choice=sc.nextInt();
            while(choice!=9 && choice!=0){
                switch (choice){
                    case 1:
                        showroom[showroomCounter]=new ShowRoom();
                        showroom[showroomCounter].setDetails();
                        showroomCounter++;
                        System.out.println();
                        System.out.println("1.Add New Showroom");
                        System.out.println("9. Go back to the main menu");
                        choice=sc.nextInt();
                        break;
                    case 2:
                        employees[employeesCounter]=new Employees();
                        employees[employeesCounter].setDetails();
                        employeesCounter++;
                        System.out.println();
                        System.out.println("1.Add New Employee");
                        System.out.println("9. Go back to the main menu");
                        choice=sc.nextInt();
                        break;
                    case 3:
                        car[carCounter]=new Car();
                        car[carCounter].setDetails();
                        carCounter++;
                        System.out.println();
                        System.out.println("1.Add New Car");
                        System.out.println("9. Go back to the main menu");
                        choice=sc.nextInt();
                        break;
                    case 4:
                        for(int i=0;i<showroomCounter;i++){
                            showroom[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. Go back to the main menu");
                        choice=sc.nextInt();
                        break;
                    case 5:
                        for(int i=0;i<employeesCounter;i++){
                            employees[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. Go back to the main menu");
                        choice=sc.nextInt();
                        break;
                    case 6:
                        for(int i=0;i<carCounter;i++){
                            car[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. Go back to the main menu");
                        choice=sc.nextInt();
                        break;
                    default:
                        System.out.println("Enter valid Choice: ");
                }
            }
        }

    }
}
