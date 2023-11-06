class employee {
  void incrementsalary(){
    System.out.println(" 20000");
  }
}
class developer extends employee{
  void incrementsalary(){
    System.out.println("10000");
  }
}
class manager extends employee{
  void incrementsalary(){
    super.incrementsalary();
    System.out.println("50000");
  }
}
  public class Superkey{
    public static void main(String[]args){
      manager s=new manager();
      s.incrementsalary();
    }
  }