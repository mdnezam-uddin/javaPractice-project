public class creating_thread {
    public static class MyThread extends Thread{
        public void run(){
            System.out.println("MyThread is running");
            System.out.println("MyThread is finished");
        }
    }
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
    }
}
