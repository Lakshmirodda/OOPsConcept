class Employee
{
 int id;
  String a;
  int age;
  double salary;
  Employee(int i,String c,int d){
    id=i;
    a=c;
    age=d;
  }
  Employee(double e,int i){
    salary=e;
    id=i;
  }
  void display(){
    System.out.println(id);
     System.out.println(a);
    System.out.println(age);
    System.out.println(salary);
  }
}
public class Constructoroverloading
{
	public static void main(String[] args) {
    Employee t=new Employee(50000,1);
    Employee s=new Employee(1,"abd",14);
    t.display();
    s.display();
  }
}