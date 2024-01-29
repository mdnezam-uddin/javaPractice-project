import java.util.Scanner;
public class cwh_19_practice {
    public static void main(String[] args) {
//        int m1,m2,m3;
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Marks of Math: ");
//        m1= sc.nextInt();
//        System.out.print("Marks of Bio: ");
//        m2= sc.nextInt();
//        System.out.print("Marks of Eng: ");
//        m3= sc.nextInt();
//        float avg= (m1+m2+m3)/3.0f;
//        System.out.println("Your avg mark:" + avg);
//        if(avg>40 && m1>33 && m2>33 && m3>33){
//            System.out.println("Congratulations, You have been promoted!");
//        }else {
//            System.out.println("Sorry, You have not been promoted! Please try again.");
//        }
        System.out.print("Enter a year:");
        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();
        if(year%4==0){
            System.out.println("The year is leap year!");
        }else{
            System.out.println("The year is not leap year!");
        }

    }
}
