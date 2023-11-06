class college{
  int a;
  String b;
  college(int a, String b){
    this.a=a;
    this.b=b;
  }
}
class student extends college{
  double c;
  student(int a, String b, double c){
    super(a,b);
    this.c=c;
  }
  void display(){
  
     System.out.println(a);
     System.out.println(b);
    System.out.println(c);
  }
}
  public class Superkey2{
    public static void main(String[]args){
      student s=new student(1,"abc",20000);
      s.display();
    }
  }