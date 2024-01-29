class Employee {
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee nezam = new Employee();
        Employee jamir = new Employee();
        //setting attributes
        nezam.id = 14;
        nezam.salary = 30;
        nezam.name = "CodeWithHarry";
        jamir.id =16;
        jamir.salary = 50;
        jamir.name = "CodeWithMosh";
        //printing the attributes
//        System.out.println(nezam.id);
//        System.out.println(nezam.name);
        nezam.printDetails();
        //jamir.printDetails();
        int salary = nezam.getSalary();
        System.out.println(salary);
    }
}
