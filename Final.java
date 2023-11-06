 class college {
    void marry(){
    System.out.println(" marry1");
  }
}
 final class student extends college{
  void marry(){
    System.out.println("marry");
  }
}
  public class Final{
    public static void main(String[]args){
      student s=new student();
      s.marry();
    }
  }