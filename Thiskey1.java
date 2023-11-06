class Student{
  void sleep(){
    weakup();
    System.out.println("abcd");
  }
  void weakup(){
    System.out.println("acdms");
  }
}
public class Thiskey1{
  public static void main(String[]args){
    Student s=new Student();
    s.sleep();
  }
}