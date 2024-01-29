class circle{
    public int r;
    public circle(){
        System.out.println("I am non parameterized constructor");
    }

    public circle(int r) {
        System.out.println("I am circle parameterized constructor");
        this.r = r;
    }

    public double area(){
        return Math.PI*this.r*this.r;
    }
}
class cylinder1 extends circle{
    public int h;

    public cylinder1(int r, int h) {
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.h = h;
    }

    public double volume(){
        return Math.PI*this.r*this.r*this.h;
    }
}
public class cwh_52_class_ps {
    public static void main(String[] args) {
        cylinder1 cd= new cylinder1(5,10);

        System.out.println(cd.volume());
    }
}
