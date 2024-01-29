import java.util.Random;
import java.util.Scanner;

public class cwh_41_exSol {
    public static void main(String[] args) {
        //Rock for 0
        //Paper for 1
        //Scissor for 2
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 0 for scissor,1 for paper and 2 for rock: ");
        int userInput= sc.nextInt();

        Random random= new Random();
        int comInput= random.nextInt(3);

        if(userInput==comInput){
            System.out.println("Draw!");
        } else if ((userInput==0 && comInput==2) || (userInput==2 && comInput==1)
                || (userInput==1 && comInput==0)) {
            System.out.println("User wins!");
        }else {
            System.out.println("Computer wins!");
        }

    }
}
