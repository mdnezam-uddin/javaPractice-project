class cRunnable implements Runnable{
    cRunnable(String name){
        System.out.println("hey "+name);
    }
    public void run(){
        System.out.println("This is cRunnable Thread");
    }
}
public class cwh_72_constructor_in_thread {
    public static void main(String[] args) {
        cRunnable c=new cRunnable("Nezam");
        Thread cTh=new Thread(c);
        cTh.start();
        cTh.setName("My thread");
        System.out.println(cTh.getName());
        System.out.println(cTh.getId());
    }
}
