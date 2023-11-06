interface parent1{
  void baby();
}
interface parent2{
  void baby();
}
class child implements parent1,parent2{
  public void baby(){
    System.out.println("my baby");
  }
  void baby1(){
    System.out.println("my baby1");
  }
  void display(){
    System.out.println("who is father");
  }
}
public class Interface11{
  public static void main(String[]args){
    child s=new child();
    s.display();
     s.baby();
     s.baby1();
  }
}