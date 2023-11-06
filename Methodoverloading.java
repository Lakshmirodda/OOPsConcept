class Addition{
 void add(int a,int b){
    System.out.println(a+b);
  }
 void add(int a, float b){
   System.out.println(a+b);
 }
}
public class Methodoverloading{
  public static void main(String[]args){
    Addition s=new Addition();
    s.add(10,20);
    s.add(20,30);
  }
}