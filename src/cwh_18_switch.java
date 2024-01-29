import java.util.Scanner;
public class cwh_18_switch {

    public static void main(String[] args) {
        System.out.print("Enter a new number: ");
       Scanner sc= new Scanner(System.in);
       int age;
       age= sc.nextInt();
       switch (age){
           case 10:
               System.out.println("You are Children!");
               break;
           case 20:
               System.out.println("You are Young!");
               break;
           case 40:
               System.out.println("You are Adult!");
               break;
           default:
               System.out.println("You are Old!");
               break;
       }

    }
}
