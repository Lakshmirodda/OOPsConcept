class grandfather{
  String name="adc";
  int age=50;
  char c='a';
  }
class father extends grandfather{
 String fathername="acdd";
  int fage=35;
  char fc='b';
  }
class child extends father{
String childname="addd";
  int cage=18;
  char cc='d';
  }
public class MultilevelInheritance{
  public static void main(String []args){
    child p=new child();
    System.out.println(p.name+","+p.age+','+p.c);
    System.out.println(p.fathername+","+p.fage+","+p.fc);
    System.out.println(p.childname+","+p.cage+","+p.cc);
  }
}