class Mobile{
   static String name;
   int price;

   public void show(){
      System.out.println(name + ": " + price);
   }
   public Mobile(){
      System.out.println("Printed in constructor");
   }

   static{
      name="Phone";
      System.out.println("Printed in static block");
   }
   public static void show1(Mobile mob1){
      System.out.println(name + ": " + mob1.price);
   }
}


public class staticvariable {
     public static void main(String[] args){


     
Mobile mob = new Mobile();
Mobile.name = "MyPhone";
mob.price = 1700;

Mobile mob1 = new Mobile();
Mobile.name = "Iphone";
mob1.price = 2000;


mob.show();
Mobile.show1(mob1);


     }
}
