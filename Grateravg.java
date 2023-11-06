public class Grateravg
  {
  public static void main (String[]args){
  int[]a={1, 4, 17, 7, 25, 3, 100};
  int sum=0;
  int avg;
  for(int i=0;i<7;i++){
   sum=sum+a[i];
  }
   avg=sum/7;
  for(int i=0;i<7;i++){
    if(a[i]>avg)
  System.out.println(a[i]);
}
}
  }