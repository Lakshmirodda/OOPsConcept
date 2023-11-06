class shape{
  double getArea(){
    return 0.0;
  }
}
class rectangle extends shape{
  int len;
  int wid;
  rectangle(int len, int wid){
    this.len=len;
    this.wid=wid;
  }
     double getArea(){
    return len * wid;
  }
}
  public class MultilevelInheritance1{
    public static void main(String[]args){
      rectangle r=new rectangle(4,6);
      double area =r.getArea();
      System.out.println(area);
    } 
  }
