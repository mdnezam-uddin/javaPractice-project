//class Employee1{
//    int salary;
//    String name;
//    public int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name =n;
//    }
//
//}
/*
class Cellphone{
    public void getRing(){
        System.out.println("Ringing...");
    }
    public void getVibrate(){
        System.out.println("Vibrating...");
    }
    public void getCall(){
        System.out.println("Calling...");
    }
}
*/
class Square{
    int a;
    public int area(){
        return a*a;
    }
    public int perimeter(){
        return 4*a;
    }
}
public class cwh_39_class_ps {
    public static void main(String[] args) {
//        //problem 1
//        Employee1 harry = new Employee1();
//        harry.setName("CodeWithHarry");
//        harry.salary = 260;
//        System.out.println(harry.getSalary());
//        System.out.println(harry.getName());
        /*
        //problem 2
        Cellphone mobile= new Cellphone();
        mobile.getRing();
        mobile.getVibrate();
        mobile.getCall();
        */
        Square calculate= new Square();
        calculate.a=12;
        System.out.println(calculate.area());
        System.out.println(calculate.perimeter());
    }
}
