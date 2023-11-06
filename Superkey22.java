class bank{
  String name;
  String branch;
  bank(String name, String branch){
    this.name=name;
    this.branch=branch;
  }
}
class SBI extends bank{
  int ifccode;
  SBI(String name, String branch, int ifccode){
    super(name,branch);
    this.ifccode=ifccode;
  }
}
  class ICIC extends SBI{
  int accno;
   ICIC(String name, String branch, int ifccode, int accno){
    super(name,branch,ifccode);
    this.accno=accno;
  }
  void display(){
  
     System.out.println(name);
     System.out.println(branch);
    System.out.println(ifccode);
    System.out.println(accno);
  }
  }
  public class Superkey22{
    public static void main(String[]args){
      ICIC s=new ICIC("Adi","edara",20000,1200000);
      s.display();
    }
  }