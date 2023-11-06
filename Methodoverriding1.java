class animal {
  void eat(){
    System.out.println(" eat");
  }
}
class dog extends animal{
  void eat(){
    System.out.println("eat1");
  }
}
class donkey extends animal{
  void eat(){
    System.out.println("eat11");
  }
}
class lion extends animal{
  void eat(){
    System.out.println("eat1111");
  }
}
  public class Methodoverriding1{
    public static void main(String[]args){
      lion s=new lion();
      s.eat();
    }
  }