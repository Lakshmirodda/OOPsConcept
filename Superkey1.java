class college{
  int a=10;
}
class student extends college{
  int a=23;{
     System.out.println(a);
  System.out.println(super.a);
  }
}
  public class Superkey1{
    public static void main(String[]args){
      student s=new student();
    }
  }