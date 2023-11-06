class college {
  void marry(){
    System.out.println(" marry1");
  }
}
class student extends college{
  void marry(){
    System.out.println("marry");
  }
}
  public class Methodoverriding{
    public static void main(String[]args){
      student s=new student();
      s.marry();
    }
  }