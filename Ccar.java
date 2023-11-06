class Car
{
    String carno="AP26D05551";
    String carname="Suzuki";
    String brandname="Tata";
   void display(){
    System.out.println(carno);
    System.out.println(carname);
	    System.out.println(brandname);
    }
}
public class Ccar
{
	public static void main(String[] args) {
	    Car s=new Car();
	    s.display();
	}
}
