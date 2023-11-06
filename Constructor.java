class Employee
{
 int id;
  String a;
  int age;
  int salary;
  Employee(int i,String c,int d,int e){
    id=i;
    a=c;
    age=d;
    salary=e;
  }
  Employee(){
    System.out.println("abcdes");
  }
  void display(){
    System.out.println(id);
     System.out.println(a);
    System.out.println(age);
    System.out.println(salary);
  }
}
public class Constructor
{
	public static void main(String[] args) {
    Employee t=new Employee();
    Employee s=new Employee(1,"abd",14,12000);
    s.display();
	}
}
