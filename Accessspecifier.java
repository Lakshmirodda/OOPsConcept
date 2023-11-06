class hello{
  private void work(){
    System.out.println("private");
  }
  protected void hii(){
    work();
    System.out.println("protected");
  }
  public void hiii(){
    hii();
    System.out.println("public");
  }
   void def(){
    hiii();
    System.out.println("default");
  }
}
public class Accessspecifier{
  public static void main(String[]args){
    hello s=new hello();
    s.def();
  }
}
