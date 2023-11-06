class Student{
  int a;
  int salary;
  String s;
  Student(int a,String s){
   this.a=a;
    this.s=s;
  }
  Student(int a,int salary,String s){
    this(a,s);
    this.salary=salary;
  }
  void display(){
    System.out.println(a);
     System.out.println(s);
     System.out.println(salary);
  }
}
public class Thiskey
{
	public static void main(String[] args) {
    Student u=new Student(1,"cccc");
    Student t=new Student(10,20000,"abcd");
    t.display();
    u.display();
	}
}