import java.lang.reflect.AccessFlag;

interface bicylcle{
    int a=59;
    abstract void applyBrake(int decrement);
    abstract void speedUp(int increment);
}
interface HoronBicylcle{
    int s=59;
    abstract void horonP();
    abstract void horonK();
}
class AvonCylce implements bicylcle,HoronBicylcle{
     public void applyBrake(int decrement){
        System.out.println("Apply Braking..");
    }
    public void speedUp(int increment){
        System.out.println("Speed up..");
    }
    public void horonP(){
        System.out.println("Main hoon na");
    }
    public void horonK(){
        System.out.println("Tubi aja");
    }
}
public class cwh_55_absClass_interface {
    public static void main(String[] args) {
        AvonCylce ac=new AvonCylce();
        ac.applyBrake(2);
        // you can create properties in interface
        System.out.println(ac.a);
        // you can not modify properties
        //ac.a=45;

        ac.horonK();
        ac.horonP();

    }
}
