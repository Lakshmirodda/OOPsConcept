import java.util.Scanner;
public class MultilevelInheritance2{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("1.square");
		System.out.println("2.triangle");
		System.out.println("3.circle");
		System.out.println("4.rectangle");
		System.out.println("5.parallelogram");
		int n=sc.nextInt();
		switch(n){
		    case 1:
		        System.out.println("enter the side of square");
		        int s=sc.nextInt();
		        int s1=s*s;
		        System.out.println("area of square is : "+s1);
		        break;
		    case 2:
		        System.out.println("enter the base of triangle");
		        System.out.println("enter the height of triangle");
		        int b=sc.nextInt();
		        int h=sc.nextInt();
		        int s2=1/2*b*h;
		        System.out.println("area of triangle is : "+s2);
		        break;
		   case 3:
		       System.out.println("enter the radius of circle");
		        double r=sc.nextInt();
		        double s3=3.14*r*r;
		        System.out.println("area of circle is : "+s3);
		        break;
		  case 4:
		      System.out.println("enter the width of rectangle");
		      System.out.println("enter the height of rectangle");
		        int w=sc.nextInt();
		        int h1=sc.nextInt();
		        int s4=w*h1;
		        System.out.println("area of rectangle is : "+s4);
		        break; 
		  case 5:
		      System.out.println("enter the base of parallelogram");
		      System.out.println("enter the height of parallelogram");
		        int b1=sc.nextInt();
		        int h2=sc.nextInt();
		        int s5=b1*h2;
		        System.out.println("area of parallelogram is : "+s5);
		        break; 
		 default:
		     System.out.println("invalid");
		}
	}
}