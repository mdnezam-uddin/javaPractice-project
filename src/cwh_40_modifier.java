class MyEmployee{
    private int id;
    private String name;
    public void setName(String a){
        name=a;
    }
    public String getName(){
        return name;
    }
    public void setId(int b){
        id=b;
    }
    public int getId(){
        return id;
    }
}
public class cwh_40_modifier {
    public static void main(String[] args) {
        MyEmployee harry= new MyEmployee();
        //harry.id= 12;
        //harry.name= "CodeWithHarry";
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(15);
        System.out.println(harry.getId());
    }
}
