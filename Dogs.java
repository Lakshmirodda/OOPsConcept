class Dog
{
    String dogname="jani";
    int dogage=1;
   void sleep(){
    System.out.println(dogname);
    System.out.println(dogage);
    }
  void barking(){
    System.out.println("dog is Barking");
  }
}
public class Dogs
{
	public static void main(String[] args) {
	    Dog s=new Dog();
	    s.sleep();
    s.barking();
	}
}
