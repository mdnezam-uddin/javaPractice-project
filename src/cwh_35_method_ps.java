public class cwh_35_method_ps {
    static void multiplication(int x){
        for (int i=1;i<=10;i++){
            System.out.format("%d * %d = %d",x,i,x*i);
            System.out.format("\n");
        }
    }
    static int recursive(int n){
        if(n==1){
            return 1;
        }else {
            return n+recursive(n-1);
        }
    }
    public static void main(String[] args) {
        multiplication(5);

        System.out.println(recursive(5));
    }
}
