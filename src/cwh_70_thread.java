class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=1;
        while (i<=500){
            System.out.println("My Thread is Running and i see this!");
            System.out.println("I am Happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=1;
        while (i<=500){
            System.out.println("Thread 2 is good!");
            System.out.println("I am Sad");
            i++;
        }
    }
}
public class cwh_70_thread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}
