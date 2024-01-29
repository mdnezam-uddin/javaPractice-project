class Human{
    String name;
    Human(String name,int age,double mark){
        name=name;
        age=age;
        mark=mark;
    }

}
public class constructor {
    public static void main(String[] args) {
        Human human=new Human("Nezam",22,80.88);
        Human human1=new Human("Zonaid",22,90.88);
        System.out.println(human1.name);
    }
}
