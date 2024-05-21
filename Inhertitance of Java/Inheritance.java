public class Inheritance{
    public static void main(String[] args){
  VeryAdvCalc obj = new VeryAdvCalc();
  int r1= obj.add(2, 4);
  int r2= obj.sub(4, 2);
  int r3= obj.multi(4, 2);
  int r4= obj.div(4, 2);
  double r5= obj.power(4, 2);


  System.out.println(r1 + " " + r2 +" " + r3 +" "+ r4+ " " + r5) ;
    }
}