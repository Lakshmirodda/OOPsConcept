class Animal{
  void sleep(){
    System.out.println("sleeping");
  }
}
class duck extends Animal{
  void walk(){
    System.out.println("walking");
  }
}
public class SingleInheritance{
  public static void main(String []args){
    duck p=new duck();
    p.walk();
    p.sleep();
  }
}