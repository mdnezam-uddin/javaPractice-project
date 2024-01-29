class Encap{
    protected String name;
    protected String model;
    private int year;
    public Encap(String name,String model,int year){
        this.setName(name);
        this.setModel(model);
        this.setYear(year);
    }
    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }

}
public class get_set {
    public static void main(String[] args) {
        Encap encap=new Encap("Tesla","Tesla 3.0",2023);
        // getter Method
//        System.out.println(encap.getName());
//        System.out.println(encap.getModel());
//        System.out.println(encap.getYear());
        // setter Method
        encap.setName("BMW");
        encap.setModel("BMW 5.5");
        encap.setYear(2024);
        System.out.println(encap.getName());
        System.out.println(encap.getModel());
        System.out.println(encap.getYear());

    }
}
