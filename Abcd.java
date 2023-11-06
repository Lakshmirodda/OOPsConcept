import java.util.Scanner;
public class Abcd{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Statement = ");
    String a=sc.nextLine();
   String rev="";
    for(int i= a.length()-1;i>=0;i++)
      {
        char c=a.charAt(i);
        rev=rev+c;
      }
    System.out.println(rev);
  }
}