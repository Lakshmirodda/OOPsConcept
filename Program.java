class Student
{
    int id=1;
    int age=2;
   void sleep(){
    System.out.println("she always sleep");
    System.out.println(id);
	    System.out.println(age);
    }
   void fight(){
    System.out.println("she is always fight with her bro");
    }
}
public class Program
{
	public static void main(String[] args) {
	    Student s=new Student();
	    System.out.println(s.id);
	    System.out.println(s.age);
	    s.sleep();
	    s.fight();
	}
}
