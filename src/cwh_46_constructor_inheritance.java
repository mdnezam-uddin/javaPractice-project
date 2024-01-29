class Base{
    int x;

    public Base() {
        System.out.println("I am a constructor");
    }
    public Base(int x) {
        System.out.println("I am a overloaded constructor with value of X: " + x);
    }

}
class Derived extends Base{

    int y;

    public Derived() {
        //super(5);
        System.out.println("I am a Derived constructor");
    }
    public Derived(int x,int y) {
        super(x);
        System.out.println("I am a overloaded Derived constructor with value of Y: "+ y);
    }

}
class ChildDerived extends Derived{
    int z;
    public ChildDerived(){
        System.out.println("I am a child derived constructor");
    }
    public ChildDerived(int x,int y,int z){
        super(x, y);
        System.out.println("I am a overloaded child derived constructor with value of Z: "+z);
    }
}

public class cwh_46_constructor_inheritance {
    public static void main(String[] args) {
        //Base base= new Base();
        //Derived derived= new Derived(12,50);
        ChildDerived cd= new ChildDerived(10,15,20);
    }
}
