
class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*height+2* Math.PI*radius*radius;
    }
}
public class cwh_44_getterSetter_ex {
    public static void main(String[] args) {
//        //problem 1
//        Cylinder cs= new Cylinder();
//        cs.setHeight(15);
//        int h= cs.getHeight();
//        System.out.println(h);
//        // for radius
//        cs.setRadius(10);
//        int r= cs.getRadius();
//        System.out.println(r);
        //problem 2
        Cylinder myCylinder= new Cylinder();
        myCylinder.setRadius(12);
        myCylinder.setHeight(15);
        System.out.println(myCylinder.surfaceArea());
    }
}
