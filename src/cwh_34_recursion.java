import java.util.Scanner;
public class cwh_34_recursion {
    static int factorial(int n){
        if(n==0 || n==1 ){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    //using iterative
    static int factorial_iterative(int n){
        if(n==0 || n==1 ){
            return 1;
        }else{
            int product=1;
            for(int i=1;i<=n;i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int x=sc.nextInt();
        System.out.println("factorial for x is: " + factorial(x));
        //using iterative
        System.out.println("factorial for x is: " + factorial_iterative(x));
    }
}
