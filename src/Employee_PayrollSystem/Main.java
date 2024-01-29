package Employee_PayrollSystem;

import java.util.ArrayList;

abstract class Employee{
    private String name;
    private int id;
    public Employee(String name, int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public abstract double calculateSalary();
    @Override
    public String toString(){
        return "Employee [name="+name+",id="+id+", salary="+calculateSalary()+"]";
    }
}
class FullTimeEmp extends Employee{
    private double monthlySalary;
    public FullTimeEmp(String name,int id,double monthlySalary){
        super(name,id);
        this.monthlySalary=monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
class PartTimeEmp extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmp(String name,int id,int hoursWorked,double hourlyRate){
        super(name,id);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }
    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}
class PayrollSystem{
    private ArrayList<Employee> employeeList;
    public PayrollSystem(){
        employeeList =new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void remEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee: employeeList){
            if(employee.getId()==id){
                employeeToRemove = employee;
                break;
            }
            if(employeeToRemove !=null){
                employeeList.remove(employeeToRemove);
            }
        }
    }
    public void displayEmployees(){
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem =new PayrollSystem();
        FullTimeEmp fullTimeEmp1 =new FullTimeEmp("Nezam",13,50000);
        PartTimeEmp partTimeEmp1 =new PartTimeEmp("Riyad",14,8,1300);

        payrollSystem.addEmployee(fullTimeEmp1);
        payrollSystem.addEmployee(partTimeEmp1);
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();
        System.out.println("Removing Employees: ");
        payrollSystem.remEmployee(14);
        System.out.println("Remaining Employees: ");
        payrollSystem.displayEmployees();
    }
}
