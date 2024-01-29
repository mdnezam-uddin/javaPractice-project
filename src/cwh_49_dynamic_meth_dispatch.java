class phone{
    public void greet(){
        System.out.println("Good moring!");
    }
    public void name(){
        System.out.println("My name is Nezam");
    }
}
class smartPhone extends phone{
    public void swagat(){
        System.out.println("Greetings to you all!");
    }
    public void name(){
        System.out.println("MY name is Nezam in clas two");
    }
    public void call(){
        System.out.println("Calling...");
    }
}
public class cwh_49_dynamic_meth_dispatch {
    public static void main(String[] args) {
//        phone obj=new phone();
//        obj.greet();
//        smartPhone sm= new smartPhone();
//        sm.name();
        phone obj=new smartPhone();
        obj.name();
        obj.greet();
        //obj.call(); //not allowed
        //smartPhone ph=new phone(); throw errors
    }
}
