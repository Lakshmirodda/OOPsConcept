class Emp{
  double sal=40000;
}
class pro extends Emp{
  int bonus=1000;
}
public class Inheritance{
  public static void main(String []args){
    pro p=new pro();
    System.out.println(p.bonus);
    System.out.println(p.sal);
  }
}