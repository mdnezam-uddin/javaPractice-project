abstract class parents{
    public parents() {
        System.out.println("I am a constructor of parent class");
    }
    public void hello(){
        System.out.println("Ni hao ma?");
    }
    abstract public void greet();
}
class child1 extends parents{
    public void greet(){
        System.out.println("Good morning");
    }
}
  class child2 extends parents{
    public void greet(){
        System.out.println("Good evening");
    }
}
public class cwh_53_abstract_class {
    public static void main(String[] args) {
        child1 cd1= new child1();
        cd1.greet();
        child2 cd2=new child2();
    }
}
